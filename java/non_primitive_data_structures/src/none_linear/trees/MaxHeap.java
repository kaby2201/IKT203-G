package none_linear.trees;

public class MaxHeap <E>{
    private int lastIndex;
    private final E[] array;

    // Initializing the first index to -1, because we don't have element at the beginning.
    /**
     * @param size to initialize the heap
     */
    public MaxHeap(int size) {
        lastIndex = -1;
        array = (E[]) new Object[size];
    }

    /**
     * @param value object to add to the heap
     */
    public void add(E value) {
        array[++lastIndex] = value;
        tripelUp(lastIndex);
    }

    /**
     *
     * @param lastIndex
     */
    private void tripelUp(int lastIndex) {
        if (lastIndex == 0) return;

        int parentIndex = (int) Math.floor((lastIndex - 1)/ 2);
        if (((Comparable<E>) array[lastIndex]).compareTo(array[parentIndex]) > 0) {
            swap(lastIndex, parentIndex);
            tripelUp(parentIndex);
        }
    }

    public void remove() {
        swap(0, lastIndex--);
        tripleDown(0);
    }

    private void tripleDown(int parent) {
        int leftChild = (parent * 2) + 1;
        int rightChild = (parent * 2) + 2;

        // The parent is bigger then leftChild
        if (lastIndex == leftChild && ((Comparable<E>) array[parent]).compareTo(array[leftChild]) < 0) {
            swap(parent, leftChild);
            return;
        }

        // The parent is bigger then then rightChild
        if (rightChild == parent && ((Comparable<E>) array[parent]).compareTo(array[rightChild]) < 0) {
            swap(parent, rightChild);
            return;
        }

        if (leftChild >= lastIndex || rightChild >= lastIndex) {
            return;
        }
        
        if (((Comparable<E>)array[leftChild]).compareTo(array[rightChild]) > 0 && ((Comparable<E>)array[parent]).compareTo(array[leftChild])< 0) {
            swap(parent, leftChild);
            tripleDown(leftChild);
        } else if (((Comparable<E>)array[parent]).compareTo(array[rightChild]) > 0) {
            swap(parent, rightChild);
            tripleDown(rightChild);
        }

    }

    private void swap(int lastIndex, int parentIndex) {
        E tmp = array[lastIndex];
        array[lastIndex] = array[parentIndex];
        array[parentIndex] = tmp;
    }
}
