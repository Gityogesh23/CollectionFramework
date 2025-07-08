import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNamesAlphabetically {
 public static void main(String[] args) {
    List<String>words=Arrays.asList("Streams","Java","Apache_Tomcat","SpringBoot","Spring","MicroServices");
   List<String>sortedList= words.stream().collect(Collectors.toList());
   System.out.println(sortedList);
 }   
}
