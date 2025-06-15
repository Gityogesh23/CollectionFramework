import java.util.List;
import java.util.Arrays;
Class Main{
public static void main(String[] args){
  List<Integer>l=Arrays.asList(12,13,14,15,22,33,56);
  List<Integer>sortedList=l.stream().sorted().collect(Collectors.toList());
  System.out.println("Sorted list Become :"+sortedList);
}
}
