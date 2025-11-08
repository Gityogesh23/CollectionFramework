import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToStream{
    public static void main(String[] args) {
        int[]arr={12,14,15,17};//P-Type Araay
        Integer[]array={12,16,19,20}; //NP-Type Array
               int sumOfArrayElements= Arrays.stream(arr)
                .filter(n->n%2==0)  //12,14 
                .sum(); //12+14=26
        System.out.println("Sum of an Array elements are : "+sumOfArrayElements);
         /*  Convert to Stream, square each element, and print
            Stream.of(array)
            .map(n -> n*n)   
            .forEach(System.out::println);
            */
        //can also stored it instead of printing
        //Now for Np-Type Array-->Integer[]array={12,16,19,20};
         List<Integer>sqaureOfElements=Stream.of(array)
            .map(n -> n*n)
            .collect(Collectors.toList());
         System.out.println("Square of All Elements are ->"+sqaureOfElements);//144,256,361,400 
         
//Stream API Integeration: Allows to Leverage full power of Java Stream API to perform
//Operations Like Filtering,Mapping and Reducing and more.
    }
}