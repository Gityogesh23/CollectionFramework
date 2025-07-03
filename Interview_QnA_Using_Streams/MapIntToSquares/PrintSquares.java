import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintSquares {
    public static void main(String[] args) {
        List<Integer>numbers=Arrays.asList(1,2,3,4,5);
        Map<Integer,Integer>squareMap=numbers.stream().collect(Collectors.toMap(n->n,n-> n * n));
        squareMap.forEach((key,value) -> System.out.println(key+" : "+value));
    }
}
