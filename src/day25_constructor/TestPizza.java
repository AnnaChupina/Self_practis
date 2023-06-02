package day25_constructor;

import java.util.ArrayList;

public class TestPizza {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza('S',1,1);
      //  System.out.println(pizza1);

        System.out.println("You have to pay " + pizza1.culCost());
    }


}
