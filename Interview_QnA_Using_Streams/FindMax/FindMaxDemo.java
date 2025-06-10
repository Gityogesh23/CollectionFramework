import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxDemo {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(12,34,45,67,89,100);
        int maxElement=l.stream().max(Comparator.naturalOrder()).get();
        System.out.println("MAximum Element from list become :"+maxElement);
    }
}
