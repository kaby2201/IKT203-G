/*
    Wiki: https://en.wikipedia.org/wiki/Heap_(data_structure)
    A heap is a data structure where elements are organized in a tree-base structure.
    In a Maxheap we have the heights element on top and in a Minheap we have lowers element on top.
    The first element on top is called root.
    Nodes leftChildren: 2 x parent + 1,
    Nodes rightChildren: 2 x parent + 2
    Parent nodes is: floor( nodeIndex - 1 / 2)
 */
package none_linear.trees;

public class Main {
    public static void main(String[] args) {
        MaxHeap<Integer> heap = new MaxHeap<>(10);
        heap.add(19);
        heap.add(19);
        heap.add(1);
        heap.add(0);
        heap.add(5);
        heap.add(10);
        heap.add(4);
        heap.add(3);
        heap.add(40);
        heap.add(3);

        // We can sort all the numbers in the heap by marking them as removed
        for (int i = 0; i < 10; i++) {
            heap.remove();
        }
        heap.add(44);
    }
}
