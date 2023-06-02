package day16;

import java.util.Scanner;

public class AreaAndPerimeter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "yes";
        while(answer.contains("yes")) {
        System.out.println("Enter the radius of the circle:");
        int side = input.nextInt();




            while (!(side > 0)) {
                System.err.println("Invalid Entry for radius of the circle, please enter radius of the circle");
                side = input.nextInt();
            }

            System.out.println("Diameter of circle: " + 2 * side);
            System.out.println("Area of circle: " + 3.14 * side * side);
            System.out.println("Perimeter of circle: " + 2 * 3.14 * side);


            System.out.println();
            System.out.println("Would you like to calculate another circle?   Yes/No" );
            answer = input.next().toLowerCase();

            while (!(answer.contains("yes") || answer.contains("no"))) {
                System.err.println("Invalid answer, please re-enter");
                answer = input.nextLine();
            }


        }
        System.out.println("Thank you for using Cydeo Circle Calculator APP");




        input.close();
    }

}
/*
3. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program



 */