package day28_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        ArrayList<Candy> cf = new ArrayList<>();
        cf.add(new Candy("Mars", 5,1,true));
        cf.add(new Candy("Snikers", 4,6,true));
        cf.add(new Candy("Bounty", 2,10,false));
        cf.add(new Candy("Dove", 4,6,false));
        cf.add(new Candy("bee", 2,10,false));

        for (Candy each : cf) {
            System.out.println(each.getBrand() + " - " + each.getPrice());

        }




    }
}
