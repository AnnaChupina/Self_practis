package day21_multiDimentionalArray;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int k = 0;
        int size = 0;
        for(int i = 1; i<4; i++){
            k=1;
            size+=k;
            System.out.println("year "+ i + " - growth "+ k+" cm\n" +
                    "tree size: "+ size + " cm" );
        }
        for(int i = 4; i<11; i++){
            k=2;
            size+=k;
            System.out.println("year "+ i + " - growth "+ k+" cm\ntree size: "+ size + " cm" );
        }
    }
}
