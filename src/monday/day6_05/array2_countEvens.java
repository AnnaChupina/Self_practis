package monday.day6_05;
/*      countEvens([2, 1, 2, 3, 4])->3
        countEvens([2, 2, 0])->3
        countEvens([1, 3, 5])->0

 */

import java.util.Arrays;

public class array2_countEvens {
    public static void main(String[] args) {
        int[] arr={2, 1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));

        System.out.println(countEvens(arr));
    }

    public static int countEvens(int[] nums){
        int counter = 0;
        for(int each : nums){

            // if each%2==0 we are able to understand the number is even
            if(each%2==0)
                counter++;
        }
        return counter;
    }
}
