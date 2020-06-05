"""
Quick sort is a recursive algorithm.
Complexity: Worst case o(n^2)
            Average case o(nlogn)
Variables to consider:
    - Pivot is an item in an array that has the following conditions:
        1: Correct position in final, sorted array
        2: Items to the left are smaller
        3: Items to the right are larger
"""


def quick_sort(items):
    length = len(items)
    if length <= 1:
        return items

    # Using the last element as our pivot
    pivot = items.pop()
    greater, lesser = [], []
    for item in items:
        if item > pivot:
            greater.append(item)
        else:
            lesser.append(item)
    return quick_sort(lesser) + [pivot] + quick_sort(greater)


if __name__ == '__main__':
    test_numbers = [7, 4, 2, 2, 1, 42, 9, 2]
    print(quick_sort(test_numbers))
