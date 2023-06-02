package sunday.march26;

import java.util.Arrays;

public class ReverseMiddle {

    public static void main(String[] args) {
        /*
        Create a program that will have a string consisting of three words. Print the String, but the middle word should be reversed

        ex:
        input: more java please
        output: more avaj please

         */

        String str = "more java please";
        String[] eachWord = str.split(" ");
        //  System.out.println(Arrays.toString(eachWord));
        //  System.out.println(Arrays.toString(eachWord).replace(",", "").replace("[", "").replace ("]", ""));

        String reverse = "";
        for (int i = eachWord[1].length()-1; i >=0; i--) {
            reverse += eachWord[1].charAt(i);
        }

        System.out.println(eachWord[0] + " " + reverse + " " + eachWord[2]);

    }
}
