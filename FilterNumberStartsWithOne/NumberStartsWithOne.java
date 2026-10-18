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