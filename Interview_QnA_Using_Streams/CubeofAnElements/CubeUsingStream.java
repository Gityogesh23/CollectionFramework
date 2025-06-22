import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.SupportedValuesAttribute;

public class CubeUsingStream {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(3,4,5,6,7,8,9,12,18,19);
        List<Integer>list=l.stream().map(p->(p*p*p)).filter(q->q>50).collect(Collectors.toList());
        System.out.println("Cube of each elements inside inside list which are greater than 50  :" +list);
    }
    
}
