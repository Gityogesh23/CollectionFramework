import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByDiscendingOrder {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(41,40,39,88,90,111,23,56,78);
        List<Integer>SortedListInDescendingOrder=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.err.println("Sorted List By Discendng Order Is  : "+SortedListInDescendingOrder);
    }
}
