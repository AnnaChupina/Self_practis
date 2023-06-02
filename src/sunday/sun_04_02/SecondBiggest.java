package sunday.sun_04_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
[IQ] Second Biggest Number [ArrayList, loop, conditional]

	Create a program that will have an ArrayList of Integers. Find the second biggest number in the list.
	Note: the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
 */
public class SecondBiggest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 3, 6, 2, 8, 7, 10));
        System.out.println(list);

        int max = Integer.MIN_VALUE;
        int secondMax = list.get(0);

        for (int each : list){
            if(each > max){
                secondMax = max;
                max = each;
            }
            if(each > secondMax && each < max){
                secondMax = each;
            }
        }
    }
    /*
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList (4,3,1,7,5,2,4,8,4,8));

        System.out.println(list);

        int max = list.get(0);  // 5
        int secondMax = list.get(0);  // 4

        for(int each : list){
            if (each > max){
                secondMax = max;
                max = each;
            }
            if (each > secondMax && each < max){
           secondMax = each;
        }


        }

        System.out.println("Max is : " + max);
        System.out.println("Second max is: " + secondMax);



    }

     */
    /*
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList (4,3,1,4,5,2,4,8,4,8));

        System.out.println(list);

        int max = Collections.max(list);
        int secondMax = list.get(0);
       // System.out.println(Collections.max(list));
        System.out.println("Max number: " + max);
        list.remove(max);

        list.removeAll(Arrays.asList(max));
        System.out.println(list);

        System.out.println("Second max: " + Collections.max(list));



    }

     */
}
