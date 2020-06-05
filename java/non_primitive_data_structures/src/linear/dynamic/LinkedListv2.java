package linear.dynamic;

public class LinkedListv2<E> {
    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node<E> head, tail;
    int currentSize;

    public LinkedListv2() {
        currentSize = 0;
    }

    public void addFirst() {

    }

    public void addLast(E value) {
        Node<E> node = new Node<>(value);
        currentSize++;

        if (head == null) {
            head = tail = node;
            return;
        }

        if (head == tail) {
            head.next = tail = node;
            return;
        }

        tail.next = node;
        tail = node;
    }
}
