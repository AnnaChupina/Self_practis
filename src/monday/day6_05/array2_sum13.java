package monday.day6_05;
/*
Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */
public class array2_sum13 {
    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if(current!=13){
                sum +=current;
            }else{
                i++;
            }
        }
        return sum;

    }

}
