import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithOne {
    public static List<Integer> process(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> String.valueOf(n).startsWith("1"))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] arr = {15, 23, 108, 9, 12, 110, 5};
        System.out.println(process(arr)); // Output: [15, 12, 110, 108]
    }
}

//Solution 3: Math-Based Check & Parallel Streams (Optimized)
/*
Before create temporary String objects via String.valueOf(num), which can cause heavy 
garbage collection overhead for large arrays. This optimized version uses mathematical 
division to check the first digit without object creation, combined with 
.parallel() streams for faster multi-threaded processing on large datasets.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSortOptimized {
    
    // Math-based check to avoid String object creation overhead
    private static boolean startsWithOne(int n) {
        if (n == 0) return false;
        if (n < 0) n = -n; // Handle negative numbers if applicable
        while (n >= 10) {
            n /= 10;
        }
        return n == 1;
    }

    public static List<Integer> process(int[] arr) {
        return Arrays.stream(arr)
                .parallel() // Speeds up processing for large datasets
                .filter(FilterSortOptimized::startsWithOne)
                .boxed()
                .sorted((a, b) -> Integer.compare(b, a)) // Efficient primitive comparison
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] arr = {15, 23, 108, 9, 12, 110, 5};
        System.out.println(process(arr)); // Output: [15, 12, 110, 108]
    }
}
*/