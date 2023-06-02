package day28_encapsulation;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Anna", 35, 'F', LocalDate.of(1987, 7,23));

        System.out.println(person1);

    }
}
