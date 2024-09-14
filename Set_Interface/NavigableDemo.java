import java.util.Scanner;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableDemo {
    public static void main(String[] args) {  
        NavigableSet<String> navigable_set = new TreeSet<>(); // Creating a TreeSet instance for NavigableSet
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements you want to enter into NavigableSet:");
        int n = sc.nextInt(); 
        sc.nextLine(); // Consume the leftover newline character
        System.out.println("Insert elements inside NavigableSet:"); 
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            navigable_set.add(str);
        } 
        String check="D";
        System.out.println("NavigableSet elements: " + navigable_set);
        System.out.println("check :"+navigable_set.contains("D"));//Boolean contains(element)
        System.out.println("Size of navigable_Set "+navigable_set.size());

        sc.close(); // Close the scanner to avoid resource leak
    }
}
