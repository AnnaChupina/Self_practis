package day15;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the sentence.");
        String str = input.nextLine();

        String result = "";
        String result2="";
        String ch="";
        int i=0;

        while (i< str.length()-1) {

            while ((str.substring(1+i).contains("" + str.charAt(i)))) {

                str = str.replace(("" + str.charAt(i)), "");

            }
            i++;
        }



        input.close();
        System.out.println(str);
    }

}
/*
9. Create a class called UniqueCharacters, Write a program that can return
the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD
 */