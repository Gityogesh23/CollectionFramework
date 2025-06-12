import java.util.Arrays;
import java.util.List;

public class FindTotalNumElements {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(12,13,22,33,44,54,65,76);
        long count=l.stream().count();
    
        System.out.println("count of total number of elements :"+count);
    
    }
   
}
