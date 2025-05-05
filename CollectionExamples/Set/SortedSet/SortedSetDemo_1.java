
/*
Comparator<? super E> comparator()
Returns the comparator used to order the elements in this set, or null if this 
set uses the natural ordering of its elements.
Returns:
the comparator used to order the elements in this set, or null if 
this set uses the natural ordering of its elements
 */


import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class SortedSetDemo_1 {

    public static void main(String[] args) {
        
        // Custom comparator for reverse alphabetical order
        Comparator<String> reverseOrder = (s1, s2) -> s2.compareTo(s1);

        // TreeSet (SortedSet) with custom comparator
        SortedSet<String> cities = new TreeSet<>(reverseOrder);
        
        // Adding elements
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Bangalore");

        // Print with Iterator
        System.out.println("Cities in reverse alphabetical order:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
