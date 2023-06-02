package day15;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int resultPos = 0;
        int resultNeg = 0;
        int num;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            num = input.nextInt();
            if(num>=0){
                resultPos +=1;
            }else{
                resultNeg +=1;
            }
        }
        System.out.println(resultPos + " positive and " + resultNeg + " negative");

    input.close();
    }


}
/*
2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times,
and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */