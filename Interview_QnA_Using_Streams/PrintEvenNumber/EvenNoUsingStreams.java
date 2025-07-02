

import java.util.Arrays;
import java.util.List;

public class EvenNoUsingStreams {
  public static void main(String[] args) {
    List<Integer>l=Arrays.asList(12,23,24,35,45,6,77,80,90);
    l.stream().filter(ele->ele%2==0).forEach(n->System.out.println(n));
  }  
}
