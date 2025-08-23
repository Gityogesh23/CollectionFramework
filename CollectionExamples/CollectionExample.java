import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionExample {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(3, 7, 2, 5, 8, 1, 9, 5, 4);
        
        System.out.println("Original list: " + numbers);
        
        // 1. Filter even numbers and collect them into a new list
        List<Integer> evenNumbers = numbers.stream()
                                          .filter(n -> n % 2 == 0)
                                          .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        
        // 2. Find maximum value
        Integer max = numbers.stream()
                            .max(Integer::compare)
                            .orElse(null);
        System.out.println("Maximum value: " + max);
        
        // 3. Remove duplicates using Set
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("List without duplicates: " + uniqueNumbers);
        
        // 4. Convert to map with key as number and value as its square
        Map<Integer, Integer> numberSquareMap = numbers.stream()
                                                     .distinct()
                                                     .collect(Collectors.toMap(
                                                         num -> num,
                                                         num -> num * num
                                                     ));
        System.out.println("Number-Square map: " + numberSquareMap);
        
        // 5. Sort the list in descending order
        List<Integer> sortedDescending = numbers.stream()
                                               .sorted(Comparator.reverseOrder())
                                               .collect(Collectors.toList());
        System.out.println("Sorted descending: " + sortedDescending);
        
        // 6. Calculate sum of all elements
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all elements: " + sum);
        
        // 7. Group numbers by even/odd
        Map<String, List<Integer>> evenOddGroups = numbers.stream()
                                                         .collect(Collectors.groupingBy(
                                                             n -> n % 2 == 0 ? "Even" : "Odd"
                                                         ));
        System.out.println("Grouped by even/odd: " + evenOddGroups);
    }
}


//done with the collection demo.here
