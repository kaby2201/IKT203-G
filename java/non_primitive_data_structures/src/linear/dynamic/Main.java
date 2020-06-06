package linear.dynamic;

public class Main {
    public static void main(String[] args) {
        // Linklist version 1
//        LinkedListv1<String> names = new LinkedListv1<>();
//        names.addLast("Byamungu");
//        names.addLast("Feze");
//        names.addLast("Amani");
//
//        System.out.println(names.removeFirst()); // Remove Byamungu


        // Linklist version 2
        LinkedListv2<Integer> grades = new LinkedListv2<>();

        grades.addLast(2);
        grades.addLast(6);
        grades.addLast(7);
        System.out.println(grades.removeLast());
        System.out.println(grades.removeLast());
        System.out.println();
    }
}
