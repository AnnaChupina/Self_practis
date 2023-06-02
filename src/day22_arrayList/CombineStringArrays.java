package day22_arrayList;

import java.util.ArrayList;

public class CombineStringArrays {

    public static void main(String[] args) {
       String[] arr1 = {"A", "B", "C"};
       String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> arr3 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            arr3.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3.add(arr2[i]);
        }
        System.out.println(arr3);

    }
}
/*
3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */