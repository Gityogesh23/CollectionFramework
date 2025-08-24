import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestElement {
    public static void main(String[] args){
   
    List<Integer>elements=Arrays.asList(12,13,14,100,300,600,500);
    int SecondHighestElement=elements.stream()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .get();
    System.out.println("second highest element become : "+SecondHighestElement);
    }
}
