package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllDatesBeforeAugust {

    public static void main(String[] args) {


        LocalDate x = LocalDate.of(2022,1,2);
        LocalDate y = LocalDate.of(1922,1,2);
        LocalDate z = LocalDate.of(2002,1,2);

        ArrayList<LocalDate> before = new ArrayList<>(Arrays.asList(x,y,z, LocalDate.of(1678,12,2))) ;

        before.removeIf(p-> p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(before);


    }
}
/*
9. create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016


 */