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

    private Node<E> head, tail;
    private int currentSize;

    public LinkedListv2() {
        currentSize = 0;
    }

    public void addFirst(E value) {
        Node<E> node = new Node<>(value);
        node.next = head;
        head = node;
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


    public E removeFirst() {

        if (head == null)
            return null;

        E data = head.data;
        currentSize--;


        if (head == tail) {
            head = tail = null;
        }

        head = head.next;
        return data;
    }

    public E removeLast() {
        // When there's no elements in the list
        if (tail == null)
            return null;

        E data = tail.data;
        if (tail == head)           // When there's 2 elements in the list
            tail = head = null;
        else {
            Node<E> temp = head;
            while (temp.next != tail)
                temp = temp.next;
            tail = temp;
            tail.next = null;
        }
        return data;
    }

    public int length() {
        return currentSize;
    }
}
