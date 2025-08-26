
//find missing element from an array

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingEle{
    public static void main(String[] args){
    int[]array={11,2,3,4,8,9,10};
      Set<Integer>set= Arrays.stream(array)  //IntStream  -->array elements are converted into stream of primitive int types
      .boxed() //to perform operations we can convert them into object of primitive types
      .collect(Collectors.toSet());//here array is converted into stream

      //now to find missing element
      List<Integer> list=IntStream.rangeClosed(1,10)
      .filter(i->!set.contains(i))  //not containing element so hence ! negation
      .boxed() //converted again into Stream<Integer>
      .toList();
      System.out.println(list);

    }

}
