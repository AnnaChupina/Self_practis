package day15;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive numbers: ");
        int num = input.nextInt();
        int summ = 0;

        while (num>0){
            summ+=num;
            System.out.println("enter next number");
            num = input.nextInt();
        }




        System.out.println(summ);

        input.close();

    }
}
/*
5. Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by
the user until user enters a negative number.
 */
