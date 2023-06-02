package day19_array;

import java.util.Arrays;

public class Zeros {
    public static void main(String[] args) {

        int [] array = {10, 0, 5, 0, 1, 0};
        int[]array2 = new int[6];

        for (int i = 0, j=0; j < array2.length; i++, j++) {


                if(array[j]!=0){

            array2[i]=array[j];

           }else{
            i=i-1;
                continue;
                }

        }
        System.out.println(Arrays.toString(array2));
    }
}
/*
7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */