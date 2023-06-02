package day14;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String str = input.nextLine();
        String rts ="";
        boolean isPolindrome = false;

        for(int i = str.length()-1; i>=0 ;i--){
          rts +="" + str.charAt(i);
        }
        if (str.equalsIgnoreCase(rts)){
            isPolindrome = true;
        }
        System.out.println(rts);
        System.out.println(str + " is polyndrome " + isPolindrome);


    }
}
/*

7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */