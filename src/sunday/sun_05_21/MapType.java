package sunday.sun_05_21;

import java.util.*;

public class MapType {
    public static void main(String[] args) {

        Map<Integer, Person> residents = new LinkedHashMap<>();
        //residents.add() dony work beacause not relationship between Collection
        residents.put(1, new Person("Erik", 21));
        residents.put(2, new Person("Kelly", 30));
        residents.put(3, new Person("Helen", 25));
        residents.put(2, new Person("Jane", 31));  // keys are unique, so value is upgraded

        System.out.println(residents);

        for(int key : residents.keySet()){  // keySet returns a Set of Keys
            System.out.println("In Apartment " + key + " " + residents.get(key).name  + " live there");

        }

        System.out.println("----------------------------------------------------------------------------");

        //  key: String - Continent, value: List of Strings - Countries

        Map<String, List<String>> continent = new HashMap<>();
        continent.put("North America", new ArrayList<>(Arrays.asList("US", "Canada", "Mexico")));
        continent.put("Europe", new ArrayList<>(Arrays.asList("Spain", "France", "Germany", "Monaco", "Kosovo")));
        continent.put("Asia", new ArrayList<>(Arrays.asList("China", "Korea", "Japan", "Pakistan")));

        for (Map.Entry<String, List<String >> each : continent.entrySet()){
            System.out.println("Continent: " + each.getKey());
            System.out.println("\tCountries: " + each.getValue());
        }

        // mini task: Print the First  and last letter of each country

        for(List<String> each : continent.values()){
            for(String eachCountry : each){
                System.out.println(eachCountry.substring(0,1) + eachCountry.charAt(eachCountry.length() - 1));
            }
        }

        continent.get("Europe").add("UK");  // get the List of Europe and adds the UK elements into that List
        System.out.println(continent);





    }
}
