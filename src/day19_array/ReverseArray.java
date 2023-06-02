package day19_array;

import java.sql.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int []array2 = new int[5];

        for (int i = 0, j = array2.length-1; i<array1.length; i++, j--){
            array2[j] = array1[i];
        }
        System.out.println(Arrays.toString(array2));

    }

}
/*

6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */