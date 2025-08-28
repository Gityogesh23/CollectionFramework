import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
public class FindSecHigh{
  public static void main(String[] args){
    List<Integer>list=Arrays.asList(55,66,77,88,1000,1001);
    int SecHighestElement=list.stream()
    .sorted(Comparator.reverseOrder())
    .skip(1)
    .findFirst()
    .get();
System.out.println("The Second Highest Element Become: "+SecHighestElement);
  
  }
}
