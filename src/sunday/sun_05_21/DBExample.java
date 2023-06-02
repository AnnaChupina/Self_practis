package sunday.sun_05_21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBExample {
    /*
        FIRST_NAME
        LAST_NAME
        ADDRES
     */
    public static void main(String[] args) {

        Map<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAM", "Bond");
        person1.put("ADDRESS", "007 M16 Line");

        System.out.println(person1.get("FIRST_NAME"));

        List<Map<String, String>> allPeaple = new ArrayList<>();
        allPeaple.add(person1);
        allPeaple.add(Map.of("FIRST_NAME", "Perry", "LAST_NAME", "Bond", "ADDRESS", "Kale Lane"));

        System.out.println(allPeaple);

        // mini task: Last name of everyone

       // for(Map<String, String>)
    }

}
