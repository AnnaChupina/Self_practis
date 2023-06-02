package day14;

import java.util.Scanner;

public class summNumber {
    public static void main(String[] args) {
      /*  for(int i=2;i<21;i=i+2){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int j=1;j<20;j=j+2){
            System.out.print(j + " ");
        }


       */
        for(int i=1;i<21;i++){
            if (i%2 ==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(int j=1;j<20;j++){
            if (j%2 ==1){
                System.out.print(j + " ");
            }

        }

        Scanner input = new Scanner(System.in);
        int s =0;

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            s+=i;
        }
        System.out.println(s);
        input.close();

    }
}
/*

3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */