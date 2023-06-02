package day19_array;

public class CommonElements {


    public static void main(String[] args) {

        int [] arr1= {1,2,3,4,5};
        int [] arr2= {4,5,6,7,8};
        String result="";
        String ch = "";

        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr2.length; i1++) {
              ch = "" + arr2[i]  ;
              if(arr1[i]==arr2[i1]&& !(result.contains(ch)))  {
                  result +=" " + arr2[i1];
              }
            }

        }
        System.out.println(result);
    }
}

/*

8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */