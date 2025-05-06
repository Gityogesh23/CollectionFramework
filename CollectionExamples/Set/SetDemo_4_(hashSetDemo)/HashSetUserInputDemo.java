// package CollectionExamples.Set.SetDemo_4_(hashSetDemo);

//Demo by handling possible excpetions and with custome input in demo2 may be 
//here go with hardcoded input =>to understand its function only.

import java.util.HashSet;
import java.util.Scanner;

public class HashSetUserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> items = new HashSet<>();

        try {
            System.out.print("How many items do you want to add? ");
            int count = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= count; i++) {
                System.out.print("Enter item " + i + ": ");
                String input = scanner.nextLine();
                if (items.add(input)) {
                    System.out.println("Added: " + input);
                } else {
                    System.out.println("Duplicate! Not added: " + input);
                }
            }

            System.out.println("\nAll unique items in the set:");
            for (String item : items) {
                System.out.println(item);
            }

            // Check if a particular item exists
            System.out.print("\nEnter item to search: ");
            String search = scanner.nextLine();
            if (items.contains(search)) {
                System.out.println(search + " is present in the set.");
            } else {
                System.out.println(search + " is not in the set.");
            }

            // Remove item
            System.out.print("\nEnter item to remove: ");
            String toRemove = scanner.nextLine();
            if (items.remove(toRemove)) {
                System.out.println(toRemove + " was removed.");
            } else {
                System.out.println(toRemove + " not found.");
            }

            System.out.println("\nFinal items in the set:");
            for (String item : items) {
                System.out.println(item);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            scanner.close();
        }
    }
}
