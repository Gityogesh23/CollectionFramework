//print the consecutive frequency of element---> 1 
//Also examples are created here-->
//1)print max count element. 2)print element :frequency

public class MaxConsecutiveEleCount{
  public static void main(String[] args){
    int[]elements={1,1,0,0,1,1,1,2,3,4};  //we want count of 1's as per our requirement for now //it may differe as well
    int count=0,maxCount=0;
    for(int num : elements){ //parses all the elements

      if(count==1){
        count++;
        maxCount=Math.max(count,maxCount) ;//to maximum count //this method returns greter of two int values.
//max will assign to maxCount
      }else{
        count=0; //so that number other than 1 comes -->count set to zero.//as per requirement
      }
    }
    System.out.println("Frequency of 1-->"+maxCount);

  }
}
/*
In Java, Math.max() is a static method that returns the greater of two int, long, float, 
or double values. It is not directly used to find the maximum count of elements within 
a Java Stream.
To find the maximum count of elements in a stream, particularly when you are counting 
occurrences of distinct elements (e.g., finding the element with the highest frequency), 
you would typically use a combination of Stream API operations:
Grouping and Counting:
Use Collectors.groupingBy() with Collectors.counting() to create a Map where keys are 
the distinct elements and values are their respective counts.
Finding the Maximum Count:
Obtain a stream of the map's entry set and then use the max() terminal operation with 
a Comparator to find the entry with the highest count.
Example:
Java

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxCountInStream {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        // Group words and count their occurrences
        Map<String, Long> wordCounts = Arrays.stream(words)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        // Find the entry with the maximum count
        Optional<Map.Entry<String, Long>> maxEntry = wordCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        // Extract the maximum count (and the corresponding element, if desired)
        if (maxEntry.isPresent()) {
            System.out.println("Element with max count: " + maxEntry.get().getKey());
            System.out.println("Max count: " + maxEntry.get().getValue());
        } else {
            System.out.println("No elements in the array.");
        }
    }
} 
*/