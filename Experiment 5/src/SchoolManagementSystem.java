package project;

import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Student("Harsh"));
        people.add(new Teacher("Satyam Sir"));
        people.add(new Student("Nipun"));
        people.add(new Teacher("Adhirup Sir"));

        for (Person person : people) {
            person.performDuty(); 
        }
    }
}