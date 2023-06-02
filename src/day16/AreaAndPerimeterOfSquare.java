package day16;

import java.util.Scanner;

public class AreaAndPerimeterOfSquare {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while (answer.contains("yes")){

        System.out.println("Enter the side of the square: ");
        int side = input.nextInt();

            while (side<=0){
                System.out.println("Invalid side, please re-enter");
                side = input.nextInt();
            }

            System.out.println("Area of square: " + side*side);
            System.out.println("Perimeter of square: " + 4*side);

            System.out.println("Would you like to calculate another Square?");
            answer = input.next().toLowerCase();

                while(!(answer.contains("yes") || answer.contains("no"))){
                    System.out.println("Invalid answer, please re-enter");
                    answer = input.next();
                }

        }
        System.out.println("Thank you for using Cydeo Square Calculator APP");



        input.close();
    }
}
/*
4. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program



 */