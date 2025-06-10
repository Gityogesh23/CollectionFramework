import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(12,13,45,55,67,88,90);
        int firstElement=l.stream().findFirst().get();
        System.out.println("First Element become :"+firstElement);
    }
}
