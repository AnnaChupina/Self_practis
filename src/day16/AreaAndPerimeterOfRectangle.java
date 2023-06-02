package day16;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer= "yes";
        int l, w;

        while (answer.contains("yes")){

            System.out.println("Enter the length of the Rectangle:");
            l=input.nextInt();

                while (l<=0){
                    System.err.println("Invalid number, please re-enter");
                    l=input.nextInt();
                }
            System.out.println("Enter the width of the Rectangle:");
            w=input.nextInt();

                 while (w<=0){
                    System.err.println("Invalid number, please re-enter");
                     w=input.nextInt();
                 }

            System.out.println("Area of rectangle: " + l*w);
            System.out.println("Perimeter of rectangle" + 2*(l+w));

            System.out.println("Would you like to calculate another Rectangle?");
            answer = input.next();
                while (!(answer.contains("yes") || answer.contains("no"))){
                    System.out.println("Invalid answer, please re-entre");
                    answer = input.next().toLowerCase();
                }

        }
        System.out.println("Thank you for using Cydeo Rectangle Calculator APP");




        input.close();
    }

}
/*
5. Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


 */