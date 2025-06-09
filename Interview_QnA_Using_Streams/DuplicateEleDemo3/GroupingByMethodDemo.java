import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupingByMethodDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "avocado");

        // Group words by their first letter
        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                                                                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println(groupedByFirstLetter);

    }
}


/*
 
/*
 The Collectors.groupingBy() method in Java is a powerful tool for grouping elements of a 
 stream based on a classifier function. It returns a Collector that organizes the input 
 elements into a Map. The keys of this map are the results of applying the classifier 
 function to each element, and the values are lists containing the elements that map to 
each key. 
Here's a breakdown of its functionality:
Basic Grouping:
The simplest form of groupingBy() takes a single argument: a classifier function. This 
function determines how elements should be grouped.
The result is a Map<K, List<T>>, where K is the type of the key (the result of the 
classifier function), and T is the type of the stream's elements.

 */
 