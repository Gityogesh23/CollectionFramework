import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayToStream {
    public static void main(String[] args) {
        
    int[]array={12,13,11,1,9,8,7,5,4};
    Arrays.sort(array);
    IntStream streamArray =Arrays.stream(array);//converting array into stream..
   streamArray.forEach(s->System.out.println(s)); ;
    }
}
/*
 The IntStream version is clearly more straightforward for its purpose.
In essence, Arrays.stream() returning an IntStream (or LongStream/DoubleStream) is a 
design optimization in the Java Stream API. It provides a more performant, 
memory-efficient, and convenient way to work with primitive numerical arrays in a 
functional style, avoiding the drawbacks of autoboxing/unboxing that would be present

You're asking a great question that gets to the heart of Java's Stream API design! Let's break down Arrays.stream() specifically when it returns an IntStream, and why this is beneficial.

Brief Info: Arrays.stream() returning IntStream
When you call Arrays.stream() on an array of primitive ints (i.e., int[]), it returns an IntStream rather than a generic Stream<Integer>.

Example:

Java

int[] numbers = {1, 2, 3};
IntStream intStream = Arrays.stream(numbers); // Returns an IntStream
Why is it beneficial? (And why is it used?)
The primary reasons IntStream (and LongStream, DoubleStream for long and double arrays, 
respectively) exist and are returned are performance and efficiency.

Here's a breakdown:

Avoids Boxing/Unboxing Overhead:

Java's generics (like Stream<T>) work only with objects, not primitive types.
If Arrays.stream(int[]) returned Stream<Integer>, every int in your array would 
need to be "boxed" into an Integer object.
Similarly, if you then wanted to perform an arithmetic operation (like sum()), 
those Integer objects would need to be "unboxed" back into int primitives.
This constant boxing and unboxing creates:
Memory overhead: Each Integer object requires more memory than a simple int primitive,
 plus the overhead for the object itself.
Performance overhead: The act of creating and destroying these wrapper objects, and 
the conversions, takes CPU cycles.
IntStream operates directly on primitive int values, completely eliminating this 
boxing/unboxing overhead. This makes operations on large arrays of primitives 
significantly faster and more memory-efficient.
Specialized Primitive Operations:

IntStream comes with methods specifically tailored for numerical operations that 
wouldn't make sense or be as efficient on a generic Stream<T>.
Examples include:
sum(): Calculates the sum of all elements.
average(): Calculates the average of all elements (returns OptionalDouble).
min(): Finds the minimum element (returns OptionalInt).
max(): Finds the maximum element (returns OptionalInt).
summaryStatistics(): Returns an IntSummaryStatistics object that provides count, min, 
max, sum, and average in one go.
These operations are highly optimized for primitive types. If you had a Stream<Integer>, 
you'd typically need to use reduce() or mapToInt() and then sum(), which is less direct.
Conciseness and Readability for Numerical Data:

Because of the specialized methods, code involving numerical calculations often 
becomes more concise and readable when using IntStream.
Compare:
Java

// Using IntStream
int sum = Arrays.stream(numbers).sum();

// Using Stream<Integer> (less direct for sum)
// int sum = Arrays.stream(numbers).boxed().mapToInt(Integer::intValue).sum();
// Or
// int sum = Arrays.stream(numbers).boxed().reduce(0, Integer::sum);with generic object 
streams.

 */