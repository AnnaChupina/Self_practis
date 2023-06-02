package day14;

public class Stars {

    public static void main(String[] args) {
        char star = '*';
        for (int i = 0; i <8; i++) {
            for (int j = 0; j < 6; j++) {
               if (j<5){
                   System.out.print(star + " ");
               }else{
                   System.out.println(star+" ");
               }
            }

        }
    }

}
/*1. Use a loop to print the following shape:

 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *


 */