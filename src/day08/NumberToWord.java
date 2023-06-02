package day08;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        if (num>=1 && num<=9) {

            System.out.println((num == 1) ? "One" : (num == 2) ? "Two" : (num == 3) ? "Three" : (num == 4) ? "Four" : (num == 5) ?
                    "Five" : (num == 6) ? "Six" : (num == 7) ? "Seven" : (num == 8) ? "Eight" : "Nine");
        }else{
            System.out.println("Invalid");
        }
input.close();

    }
}
