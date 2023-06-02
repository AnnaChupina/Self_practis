package day07;

public class GradeLevel {

    public static void main(String[] args) {

        int grade = 14;
        String result = "";

        if(grade >2 && grade <=5){
            result = "Elementary school";
        } else if (grade > 5 && grade <= 8){
            result = "Middle school";
        } else if(grade >8 && grade <= 12){
            result = "High school";
        } else if(grade >12 &&grade <=16){
            result = "Colledge";
        } else {
            result = "Grad School";
        }
        System.out.println(result);

    }

}

/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.

Ex:

gradeLevel = 2

output:

Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School

Note: Assume that the given number is between 1 ~ 18
 */
