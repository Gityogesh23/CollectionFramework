
//To see working of groupingBy() go to GroupingByMethodDemo..java file in same folder.//must read it.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicates{
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(41,51,61,71,82,100,101,38,100,38,41,51);
        List<Integer>duplicateElements=l.stream()
                    .collect(Collectors.groupingBy(p->p,Collectors.counting()))
                    .entrySet().stream()
                    .filter(q->q.getValue()>1)
                    .map(w->w.getKey())
                    .collect(Collectors.toList());
                    System.out.println("Duplicate elements are :"+duplicateElements);
    }
}
