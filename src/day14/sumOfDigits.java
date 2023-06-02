package day14;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String str = input.nextLine();
        int summ = 0;

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(x>'0' && x<'9'){

                summ += str.charAt(i) -48;
            }

        }
        System.out.println(summ);


        input.close();
    }
}
/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1

 */