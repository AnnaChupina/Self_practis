package monday.day6_05;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.


centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
public class array2_centeredAverage {
    public static void main(String[] args) {

    }
    public int centeredAverage(int[] nums) {

        /*
Arrays.sort(nums);
//1 2 3 4 5 6
        int [] array = new int [nums.length-2];
        int index = 0;

        for(int i=1; i < nums.length-1; i++){
            array[index++]=nums[i];
        }

         */
        Arrays.sort(nums);
        int[] newArray = Arrays.copyOfRange(nums , 1, nums.length -1);
        if (newArray.length%2==1 ){
            return newArray[newArray.length/2];
        }else{
            return (newArray[newArray.length/2] + newArray[newArray.length/2-1])/2;
        }
    }
}
