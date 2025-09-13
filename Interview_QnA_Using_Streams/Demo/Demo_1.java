import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo_1 {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(12,13,14,125,6,778,900,1000);
        int secHigh=l.stream()
                       .sorted(Comparator.reverseOrder())
                       .skip(1)
                       .findFirst()
                       .get();
        System.out.println("sec high element becomes: "+secHigh);
    }
}
