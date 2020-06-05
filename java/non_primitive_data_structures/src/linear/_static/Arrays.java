package linear._static;

public class Arrays {

    public static void main(String[] args) {
        /*
            Arrays is a data structure where elements are saved in a leaning.
            Where each elements can be access
            by index. the first index in an array is 0.
            Complexity: o(1) for all operations
         */

        // This array can hold 6 numbers
        int[] numbers = new int[5];

        // Set value 7 at index 0
        numbers[0] = 7;

        // The size of this array will get set at runtime.
        int[] grades = {3, 2, 1, 6, 8};

        for (int i = 1; i < grades.length; i++) {
            numbers[i] = grades[i-1];
        }

        // Questions:
        // what is on the first index in the numbers array?
        // What is on the last index in the numbers array?
        
        // Tips:
        // Remember in C? - why you don't have strings? Well a string is a sequence of character! 😱
    }
}
