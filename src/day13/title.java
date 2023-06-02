package day13;

import java.util.Scanner;

public class title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String str = input.nextLine();

        str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        System.out.println(str);

    }
}
/*


7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java



 */