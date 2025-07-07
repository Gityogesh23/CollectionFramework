
//write a java progrm to print distinct elements from a list of integers.

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDistinct {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(41,42,43,51,52,53,41,42,51,52,70,71,74,93,12,70,42,43);
        List<Integer>list=l.stream().collect(Collectors.groupingBy(p->p,LinkedHashMap :: new,Collectors.counting()))
        .entrySet().stream()
        .filter(q->q.getValue()>1)
        .map(p->p.getKey())
        .collect(Collectors.toList());
        System.out.println(list);
    }
}
