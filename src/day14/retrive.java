package day14;

import java.util.Scanner;

public class retrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your information: ");
        String str = input.nextLine();
        String letters = "";
        String digits= "";
        String specialChar = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >='A' && str.charAt(i)<='Z'){
                letters += "" + str.charAt(i);
            }else if(str.charAt(i) >='a' && str.charAt(i)<='z'){
                letters += "" + str.charAt(i);
            }else if(str.charAt(i) >='0' && str.charAt(i)<='9'){
                digits += "" + str.charAt(i);
            }else if(str.charAt(i) >='!' && str.charAt(i)<='.'){
                specialChar += "" + str.charAt(i);
            }

        }

        System.out.println("letters: "+ letters+ "\ndigits: " + digits+ "\nspecial chars: "+ specialChar);
        input.close();

    }
}
/*

5. write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */