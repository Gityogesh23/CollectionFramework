/*
 This example demonstrates how a Set differs from other collections:

Unlike a List, a Set doesn't maintain order or allow duplicates
Unlike a Map, a Set only stores single elements (not key-value pairs).

Basic operations: add, remove, contains, size, isEmpty, clear
Set operations: union (addAll), intersection (retainAll), difference (removeAll)

 However, there are other implementations like TreeSet (which keeps elements sorted) 
 and LinkedHashSet (which maintains insertion order)
*/
import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        // Create a new HashSet
        Set<String> programmingLanguages = new HashSet<>();
        
        // Add elements to the set
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");  // Adding duplicate
        
        // Print the set
        System.out.println("Programming Languages Set: " + programmingLanguages);
        
        // Check the size of the set
        System.out.println("Size of set: " + programmingLanguages.size());
        
        // Check if an element exists in the set
        System.out.println("Contains Java? " + programmingLanguages.contains("Java"));
        System.out.println("Contains PHP? " + programmingLanguages.contains("PHP"));
        
        // Remove an element from the set
        programmingLanguages.remove("C++");
        System.out.println("After removing C++: " + programmingLanguages);
        
        // Iterate through the elements
        System.out.println("\nIterating through the set:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
        
        // Create another set for demonstration
        Set<String> webLanguages = new HashSet<>();
        webLanguages.add("JavaScript");
        webLanguages.add("PHP");
        webLanguages.add("HTML");
        webLanguages.add("CSS");
        
        System.out.println("\nWeb Languages Set: " + webLanguages);
        
        // Find the intersection of two sets
        Set<String> commonLanguages = new HashSet<>(programmingLanguages);
        commonLanguages.retainAll(webLanguages);
        System.out.println("Common languages: " + commonLanguages);
        
        // Find the union of two sets
        Set<String> allLanguages = new HashSet<>(programmingLanguages);
        allLanguages.addAll(webLanguages);
        System.out.println("All languages (union): " + allLanguages);
        
        // Find the difference (languages in programmingLanguages but not in webLanguages)
        Set<String> differenceLanguages = new HashSet<>(programmingLanguages);
        differenceLanguages.removeAll(webLanguages);
        System.out.println("Languages only in programming set: " + differenceLanguages);
        
        // Clear the set
        programmingLanguages.clear();
        System.out.println("\nAfter clearing: " + programmingLanguages);
        System.out.println("Is the set empty? " + programmingLanguages.isEmpty());
    }
}