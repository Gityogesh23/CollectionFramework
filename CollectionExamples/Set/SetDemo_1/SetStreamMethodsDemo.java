
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStreamMethodsDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 5, 20, 5, 15, 25));
        System.out.println("Original Set: " + numbers); // Output: [20, 5, 25, 10, 15] (order may vary)

        // 1. Filtering: Get even numbers
        Set<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("Even Numbers: " + evenNumbers); // Output: [20, 10]

        // 2. Mapping: Multiply each number by 2
        Set<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toSet());
        System.out.println("Doubled Numbers: " + doubledNumbers); // Output: [40, 10, 50, 20, 30]

        // 3. Sorting: Get numbers in ascending order (converted to a List for ordered output)
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers); // Output: [5, 10, 15, 20, 25]

        // 4. Finding the maximum element
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compare);
        maxNumber.ifPresent(max -> System.out.println("Maximum Number: " + max)); // Output: Maximum Number: 25

        // 5. Finding the minimum element
        Optional<Integer> minNumber = numbers.stream()
                .min(Integer::compare);
        minNumber.ifPresent(min -> System.out.println("Minimum Number: " + min)); // Output: Minimum Number: 5

        // 6. Checking if any element satisfies a condition (e.g., is greater than 20)
        boolean anyGreaterThan20 = numbers.stream()
                .anyMatch(n -> n > 20);
        System.out.println("Any number greater than 20? " + anyGreaterThan20); // Output: Any number greater than 20? true

        // 7. Checking if all elements satisfy a condition (e.g., are greater than 0)
        boolean allGreaterThan0 = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("All numbers greater than 0? " + allGreaterThan0); // Output: All numbers greater than 0? true

        // 8. Checking if no element satisfies a condition (e.g., is equal to -1)
        boolean noneEqualToNegative1 = numbers.stream()
                .noneMatch(n -> n == -1);
        System.out.println("No number equal to -1? " + noneEqualToNegative1); // Output: No number equal to -1? true

        // 9. Reducing: Calculate the sum of all numbers
        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum);
        sum.ifPresent(s -> System.out.println("Sum of numbers: " + s)); // Output: Sum of numbers: 75

        // 10. Collecting to a different collection type (e.g., List)
        List<Integer> numberList = numbers.stream()
                .collect(Collectors.toList());
        System.out.println("Collected to List: " + numberList); // Output: [20, 5, 25, 10, 15] (order may vary)

        // 11. Skipping and Limiting: Skip the first 2 elements and take the next 2
        List<Integer> skippedAndLimited = numbers.stream()
                .skip(2)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("Skipped 2, Limited to 2: " + skippedAndLimited); // Output order dependent

        // 12. Distinct: Get unique elements (already a Set, but useful if starting with a List)
        Set<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toSet());
        System.out.println("Distinct Numbers: " + distinctNumbers); // Output: [20, 5, 25, 10, 15] (same as original as Set has unique elements)
    }
}