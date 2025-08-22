
//find an missing missing elements from Arrays Using Stream

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingEle {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,7,8,9,11,0,1,2,3,11,9,8,3,4,5};
        
       Set<Integer> set=Arrays.stream(arr) //give IntStream-->stream of primitive data types
       .boxed()  //Stream<Integer> -->p to np i.e converted into Objects
      .collect(Collectors.toSet()); //duplicates are removed from array here
    
     List<Integer>list =IntStream.rangeClosed(1,11)
                        .filter(i->!set.contains(i))
                        .boxed() //Stream<Integer>
                        .toList();
     System.out.println("Thge missing elements are : "+list);

    }
}
