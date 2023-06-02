package sunday.sun_04_02;

import day16.AreaAndPerimeter;

import java.util.Arrays;

public class AverageEach {

    public static void main(String[] args) {
        int[][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };
        System.out.println(Arrays.deepToString(nums));
        double sumOfAll = 0;
        int totalNumberOfElements = 0;



        for (int[] eachArr : nums) {  //  eachArr is the 1d array elements
           // System.out.println(Arrays.toString(inner));
            double sumEsch = 0; // this shoul reset each time the iuter loop runs

            for ( int eachNumber : eachArr){
                System.out.println(eachNumber);
                sumEsch += eachNumber;



            }
            double average = sumEsch/eachArr.length; // averange = sum of number / amount of numbers

            System.out.println( sumEsch + " / " + eachArr.length + " = " + average);
            System.out.println("Averange of " + Arrays.toString(eachArr) + " is " + average);

            sumOfAll += sumEsch; //  adding the sum of each inner array to the total sum
            totalNumberOfElements += eachArr.length;


        }
        System.out.println("Total averange " + (sumOfAll/totalNumberOfElements));
        //System.out.println("Total averange " + df.format(sumOfAll/totalNumberOfElements));
    }
}
/*
AverageEach [multidimensional, loop]

	Create a program that will define a 2D int array with some numbers. Go through and calculate the average of each inner array and the average of the whole 2D array

	Ex:
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
        	average of: [3, 4, 5, 6] is 4.5
        	average of: [5, 2, 6] is 4.3
        	average of: [10, 40, 25] is 25.0
        	average of all is 10.6
 */