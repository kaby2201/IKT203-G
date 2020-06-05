package linear.dynamic;
/*
    Parameterized types can hold all types of values, remember this from built in types?
    This will separate our implementation from data
 */
public class LinkedListv1<E> {
    class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E value) {
            this.data = value;
            next = null;
        }
    }

    Node<E> head;

    public LinkedListv1() {
        this.head = null;
    }

    // General solution to add elements in the list
    // Question: What is the complexity for this method?
    public void addLast(E value) {
        Node<E> node = new Node<>(value);
        if (head == null) {
            head = node;
            return;
        }

        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }


    public E removeFirst() {
        if (head == null)
            return null;

        E data = head.data;
        head = head.next;
        return data;
    }
}
