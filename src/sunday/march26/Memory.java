package sunday.march26;

import java.util.Scanner;

public class Memory {
    public static void main(String[] args) {

        Scanner front = new Scanner(System.in);
        // reference: Scanner input
        // object: new Scanner (System.in);
        Scanner back; // just reference, no object
        back = front; // the back reference also has access to the same object from line 8

        front = null;  // the front reference no longer has access to the object from line 8
        // Q: is the object one line 8  eligible for GC
        // NO, because reference still has access

        back = null;  // I removed the other reference of the object, so now it is eligible for GC

    }
}
