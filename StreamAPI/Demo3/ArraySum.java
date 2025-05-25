//Using Stream API
import java.util.Arrays;
public class ArraySum {
    public static void main(String[] args) {
        Integer[] numbers={12,13,14,12,13,15};//expected o/p=>79
   //Arrays.stream(int[] array) returns an IntStream. The IntStream interface has a sum() 
   //method specifically for summing primitive int values.     
         int sumOfElements=Arrays.stream(numbers) // Stream<Integer>
                                 .mapToInt(Integer::intValue)  // Converts Stream<Integer> to IntStream // Method to refer for knowledge s=>static IntStream	stream(int[] array);
                                 .sum();
                                 System.out.println(" sum of Array Elements: "+sumOfElements);
                                }
                            }
/*
 int[]numbers={1,2,3,3,4,4};
            IntStream sumOfElement=Arrays.stream(numbers).sum();
            int sumOfElement1=sumOfElement.sum();// IntStream has a sum() method
 */
                            
/*
     Key points:
 Scenario 1: Primitive Array (int[])
When you have a primitive int array, Arrays.stream() directly creates an IntStream. An 
IntStream has specialized methods for numerical operations like sum(), average(), min(),
 max(), etc.

 Key point: Arrays.stream(arr) where arr is int[] already gives you an IntStream. No 
 extra conversion step is needed to use sum().

Scenario 2: Wrapper Array (Integer[])
When you have an array of Integer objects (a wrapper class), Arrays.stream() creates a 
generic Stream<Integer>. A generic Stream<T> does not have a sum() method. To sum the 
elements, you must perform an intermediate operation to convert it into a primitive 
stream (like IntStream).
 
Arrays.stream(num) where num is Integer[] gives you a Stream<Integer>.
You must use .mapToInt(Integer::intValue) (or .mapToLong, .mapToDouble) to get a primitive 
stream before calling .sum().

Array Type	Method to Get Stream	Type of Stream Returned	   Has .sum()?	How to Sum
int[]	    Arrays.stream(array)	IntStream	                YES	        Arrays.stream(array).sum()
long[]	    Arrays.stream(array)	LongStream	                YES	        Arrays.stream(array).sum()
double[]	Arrays.stream(array)	DoubleStream	            YES	        Arrays.stream(array).sum()
Integer[]	Arrays.stream(array)	Stream<Integer>	            NO	        Arrays.stream(array).mapToInt(Integer::intValue).sum()
Long[]	    Arrays.stream(array)	Stream<Long>	            NO	        Arrays.stream(array).mapToLong(Long::longValue).sum()
Double[]	Arrays.stream(array)	Stream<Double>	            NO	        Arrays.stream(array).mapToDouble(Double::doubleValue).sum()



*/

