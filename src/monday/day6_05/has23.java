package monday.day6_05;
/* Given an int array length 2, return true if it does not contain a 2 or 3.
        has23([2,5])-> true
        has23([4,3])-> true
        has23([4,5])-> false

 */
public class has23 {
    public static void main(String[] args) {


    }
public static boolean no23(int[] nums){
    return (nums[0]!=2  && nums[0] !=3 && nums[1] !=2 && nums[1]!=3);
}
}
