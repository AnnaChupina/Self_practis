package sunday.sun_05_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExapmle {

    public static void main(String[] args) {

        // mini task: remove all elements less then 5

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 6, 4, 8, 3, 5, 7, 2, 1));

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next() < 5){
                it.remove();
            }
        }
        System.out.println(list);


    }
}