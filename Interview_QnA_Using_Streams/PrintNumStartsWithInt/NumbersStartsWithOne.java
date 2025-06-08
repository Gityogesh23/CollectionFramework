import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWithOne {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(12,13,14,12,22,44,55,108,110);
        List<Integer>Numbers1=l.stream().filter(n->n.toString().startsWith("1")).collect(Collectors.toList());
        System.out.println("The Numebrs starts with 1 are: "+Numbers1);
    }
}
