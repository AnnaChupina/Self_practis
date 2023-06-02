package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];
2. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];


3. Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

4. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4


 */
public class toZero {
    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list2.set(list2.size()-1,0);
        System.out.println(list2);

        System.out.println("------------------------------");

        ArrayList<String> list = new ArrayList<>(Arrays.asList( "John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed" ));

        list.remove("Ahmed");

        System.out.println(list);

        System.out.println("----------------------------");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list3.addAll(list3);
        System.out.println(list3);

        System.out.println("------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        System.out.println(Collections.max(list4));

        System.out.println("------------------------------");





    }
}
