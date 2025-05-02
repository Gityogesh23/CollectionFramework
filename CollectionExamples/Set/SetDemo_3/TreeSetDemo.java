
import java.util.*;

// Custom class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // For displaying the object
    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}

// Comparator to sort by age
class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Sort by age, if age is same, sort by name to avoid duplicates
        if (p1.age == p2.age) {
            return p1.name.compareTo(p2.name);
        }
        return Integer.compare(p1.age, p2.age);
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet with custom comparator
        TreeSet<Person> personSet = new TreeSet<>(new AgeComparator());

        // Adding elements
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        personSet.add(new Person("Charlie", 30));  // Same age as Alice
        personSet.add(new Person("David", 22));

        // Iterating using Iterator
        Iterator<Person> iterator = personSet.iterator();
        System.out.println("People sorted by age:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
