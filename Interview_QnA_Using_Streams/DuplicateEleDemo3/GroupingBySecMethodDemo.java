
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBySecMethodDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado");

        // Group words by their first letter and count the number of words in each group
        Map<Character, Long> countByFirstLetter = words.stream()
                                                          .collect(Collectors.groupingBy(word -> word.charAt(0), Collectors.counting()));

        System.out.println(countByFirstLetter);
    }
}

/*
 Advanced Grouping:
groupingBy() can also accept a second argument: a downstream collector. This allows you 
to perform further operations on the grouped elements, such as counting, summing, or 
averaging.
The result is a Map<K, D>, where D is the type of the result produced by the downstream 
collector.
 */