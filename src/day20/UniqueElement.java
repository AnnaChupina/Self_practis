package day20;

public class UniqueElement {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int i : arr1) {
            boolean uniq = true;
            for (int j : arr2) {

                if (i==j){
                    uniq = false;

                }
            }
            if (uniq){
                System.out.print(i + " ");
            }
        }
        for (int i : arr2) {
            boolean uniq = true;
            for (int j : arr1) {

                if (i==j){
                    uniq = false;

                }
            }
            if (uniq){
                System.out.print(i + " ");
            }
        }

    }
}

/*

4. Write a program that can display the unique elements of an array

			MUST use for each loops

 */