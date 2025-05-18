import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo_2 {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Grapes");

        // Attempting to add a duplicate element
        linkedHashSet.add("Apple"); // This will not be added

        // Displaying the elements in the LinkedHashSet
        System.out.println("Elements in LinkedHashSet: " + linkedHashSet);

        // Using Iterator to iterate over the elements
        System.out.println("Iterating over LinkedHashSet using Iterator:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Checking if an element exists
        if (linkedHashSet.contains("Banana")) {
            System.out.println("Banana is present in the LinkedHashSet.");
        } else {
            System.out.println("Banana is not present in the LinkedHashSet.");
        }

        // Removing an element
        linkedHashSet.remove("Mango");
        System.out.println("After removing Mango: " + linkedHashSet);

        // Clearing the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("After clearing, LinkedHashSet is empty: " + linkedHashSet.isEmpty());
    }
}
