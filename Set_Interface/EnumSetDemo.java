/*
 Class 2: EnumSet
EnumSet class which is implemented in the collections framework is one of the specialized
implementations of the Set interface for use with the enumeration type. It is a 
high-performance set implementation, much faster than HashSet. All of the elements in an 
enum set must come from a single enumeration type that is specified when the set is created
either explicitly or implicitly. Let’s see how to create a set object using this class. 
 */
import java.util.*;

enum EnumDemo { 
    CODE, LEARN, CONTRIBUTE, QUIZ, MCQ 
}

public class  EnumSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creating an empty EnumSet
        Set<EnumDemo> set1 = EnumSet.noneOf( EnumDemo.class);

        // Asking user for input size
        System.out.println("Enter the number of elements you want to add to the EnumSet: ");
        int n = sc.nextInt();  // Number of inputs

        // List the available options for the user
        System.out.println("Available options: " + Arrays.toString(Gfg.values()));

        // Loop to accept the input from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an element from the above options: ");
            String input = sc.next().toUpperCase();  // Accept input as a string and convert it to uppercase

            try {
                // Convert the input string to enum and add to EnumSet
                EnumDemo value = EnumDemo.valueOf(input);  // Convert string to enum
                set1.add(value);  // Add to the EnumSet
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + input);
            }
        }

        // Printing the EnumSet after user input
        System.out.println("Set 1 after user input: " + set1);

        sc.close();  // Closing the scanner
    }
}

