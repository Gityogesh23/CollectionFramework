/*
1. Comparable<T>
Implemented inside the class.

Defines the natural ordering (e.g., roll number ascending).

2. Comparator<T>
Implemented in a separate class or using lambda.

Defines custom ordering (e.g., name alphabetical).

Feature	    Comparable	                    Comparator
Where used	Inside the class	            Outside the class
Method	    compareTo(T o)	                compare(T o1, T o2)
Used with	Collections.sort(list)	        Collections.sort(list, comp)
Use Case	Natural/default sorting	        Custom sorting (e.g., by name)

*/

import java.util.Comparator;
import java.lang.Comparable;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// Step 1: Student class with Comparable
class Student implements Comparable<Student> {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // Natural order: sort by roll number
    @Override
    public int compareTo(Student other) {
        System.out.println("Comparing (Comparable) roll: " + this.roll + " with " + other.roll);
        return this.roll - other.roll; // ascending
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", name='" + name + '\'' + '}';
    }
}

// Step 2: Comparator class to sort by name
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        System.out.println("Comparing (Comparator) name: " + s1.name + " with " + s2.name);
        return s1.name.compareTo(s2.name); // ascending
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Yogesh"));
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Bhavesh"));

        System.out.println("Original List:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Step 3: Sort using Comparable (by roll)
        System.out.println("\nSorting using Comparable (by roll):");
        Collections.sort(list); // uses compareTo()
        for (Student s : list) {
            System.out.println(s);
        }

        // Step 4: Sort using Comparator (by name)
        System.out.println("\nSorting using Comparator (by name):");
        Collections.sort(list, new NameComparator()); // uses compare()
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

