package day04;

public class Square {

    public static void main(String[] args) {

        int side = 5;
        int area = side*side;
        int perimeter = (side+side)*2;

        System.out.println("\tArea of square is " + area + "\n\tPerimeter of the square is " + perimeter);

    }

}
/*
5. Create a class named Square and declare the following variables:
                side
                area
                perimeter

    5.1 Write a program that can calculate the area and perimeter of a square with any given  side
        Ex:
              side = 5

        output:
               Area of the square is 25
               Perimeter of the square is 20
 */