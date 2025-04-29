import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get an Iterator object for the list
        Iterator<String> iterator = names.iterator();

        // Iterate through the elements using the Iterator
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Removing an element during iteration (careful with this!)
        Iterator<String> iteratorToRemove = names.iterator();
        while (iteratorToRemove.hasNext()) {
            String name = iteratorToRemove.next();
            if (name.equals("Bob")) {
                iteratorToRemove.remove(); // Safely remove the current element
            }
        }

        System.out.println("List after removal: " + names);
    }
}