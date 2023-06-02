package day22_arrayList;

public class MaxAndMin {

    public static void main(String[] args) {

        int [] list = {1, 2, 3, 4, 5};

        int min = list[0];
        int max = list[0];

        for (int each : list) {
            if(each>max){
                max=each;
            }else if(each<min){
                min = each;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);


    }
}
/*
4. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

 */