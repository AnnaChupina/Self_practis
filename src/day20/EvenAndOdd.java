package day20;

public class EvenAndOdd {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 55};
        int arrOdd = 0, arrEven = 0;
        for (int i : arr) {
            if (i%2==0){
                arrOdd +=1;
            }else {
                arrEven += 1;
            }
        }
        System.out.println("The number of odd is "+ arrOdd);
        System.out.println("The number of even is "+ arrEven);
    }
}
/*

1.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */