//Using Stream=>

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecLargestElement {
    public static void main(String[] args) {
        List<Integer>numbers=Arrays.asList(13,55,65,75,78,95,85);
        int SecondHighElement= numbers.stream() //converting list to stream first
                .sorted(Comparator.reverseOrder()) //sort and reverse the list
                .skip(1)
                .findFirst()
                .get();
                System.out.println(SecondHighElement);
    }
}