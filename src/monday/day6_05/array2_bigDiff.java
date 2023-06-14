package monday.day6_05;
/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8

 */
public class array2_bigDiff {
    public static void main(String[] args) {
        int[] arr = {7, 2, 10, 9};
        bigDiff(arr);

    }
    public static int bigDiff(int[] nums) {

        int min = nums [0];
        int max = nums [0];

        for (int each: nums){
            if (each <min){
                min = each;
            }
            if(each>max){
                max= each;
            }

        }
        System.out.println(min);
        System.out.println(max);
        return max-min;
    }
}
