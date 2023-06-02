package day15;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");  //10
        int num1 = input.nextInt();

        System.out.println("Enter second number"); //1
        int num2 = input.nextInt();
        int count=num1;

        int result = 0;

        for (int i = 1; i < count+1; i++) {
         if ( (num1-num2) >=0){                     //10-1=9
             num1=(num1-num2);
             result +=1;
         }
        }
        System.out.println(result);



       input.close();
    }


}
