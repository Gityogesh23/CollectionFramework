/*
Implementing the Interface Directly: You can create a separate 
class that implements the Comparator<T> interface and overrides the compare() method.

*/
import java.util.Comparator;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }
}

public class ComparatorDemo_2 {
    public static void main(String[] args) {
        java.util.List<Person> people = java.util.Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        // // Sorting by name using NameComparator
        // people.sort(new NameComparator());
        // System.out.println("Sorted by name: " + people);

        // // Sorting by age using AgeComparator
        // people.sort(new AgeComparator());
        // System.out.println("Sorted by age: " + people);
         // Sorting by name using a lambda expression
        people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("Sorted by name (lambda): " + people);

        // Sorting by age using a lambda expression
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sorted by age (lambda): " + people);
        }
    }
