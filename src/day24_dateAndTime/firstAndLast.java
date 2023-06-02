package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class firstAndLast {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        list.removeIf(p-> p.charAt(p.length()-1) == p.toLowerCase().charAt(0));

        System.out.println( list);
    }
}

/*
7. Write a program that can remove string elements from an arraylist if the firat and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]

 */