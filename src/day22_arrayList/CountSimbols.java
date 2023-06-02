package day22_arrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountSimbols {

    public static void main(String[] args) {

        String str  = "Wooden Spoon!";
        String letters = "";
        String digits = "";
        String specialChars = "";



        for (char each : str.toCharArray()) {
            if(Character.isDigit(each)){
                digits +="" + each;
            }
            if(Character.isLetter(each)){
                letters += "" + each;
            }
            if(!Character.isLetterOrDigit(each)){
                specialChars += "" + each;
            }
        }



        System.out.println("digits: " + digits);
        System.out.println("letters: " + letters);
        System.out.println("Special characters: " + specialChars);

    }
}
/*
1. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
 */