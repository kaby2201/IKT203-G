/*
    Java- Autoboxing:

    byte, short, int, long, double, char boolean are all primitive types.
    The memory size will be set: Example:
        - byte  => size of 1byte
        - short => 2 bytes
        - int  => 4 bytes
        - char => 2 bytes
        ...
    Primitive types are not object, so they don't have toString, hasCode, toEquals ect.
    In java your have a wrapper for many of this types, they are all capitalize.
    Remember we don't have wrapper for int is Integer.

    Java will try to switch between those types by something called autoboxing.
    See Java doc for more.
 */

public class Main {
    public static void main(String[] args) {
        char[] alpha = new char[26];

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = (char) ('A'+i);
        }
    }
}
