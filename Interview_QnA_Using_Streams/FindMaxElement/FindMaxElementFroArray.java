//Write a program to find maximum element in array.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElementFroArray {
    public static void main(String[] args) {
        int[]a={12,34,56,78,90,100};//primitive type array
        System.out.println(Arrays.stream(a).max().getAsInt());

        List<Integer>l=Arrays.asList(12,34,56,78,90,100); //Non-Primitive Type Array.
        int max_number= l.stream().max(Comparator.naturalOrder()).get();

        System.out.println(max_number);
    }
}

/*
 Arrays.stream(a)

Arrays is a utility class in Java (java.util.Arrays) that provides static methods for 
manipulating arrays.
stream(a) is a static method of the Arrays class. It takes the int array a as input and 
returns an IntStream.

What is a Stream? In Java 8 and later, Streams provide a powerful way to process 
collections of data in a functional style. An IntStream is a specialized stream for int primitive types, optimized for integer operations. It allows you to perform a sequence of operations (like filtering, mapping, reducing) on the elements without modifying the original data source.

.max()
=> This is an intermediate operation on the IntStream.
The max() method of IntStream performs a reduction operation to find the largest element in the stream.

It returns an OptionalInt.
What is OptionalInt? OptionalInt is a container object that may or may not contain an int value. It's designed to handle cases where a result might be absent (e.g., if the stream was empty, there would be no maximum). This helps prevent NullPointerExceptions.

.getAsInt() 
=>
This is a terminal operation on the OptionalInt object returned by max().
getAsInt() is a method of OptionalInt that returns the int value contained within the OptionalInt object.
Important Note: If the OptionalInt is empty (meaning the original stream was empty and no maximum could be found), calling getAsInt() will throw a NoSuchElementException. However, in this specific code, the array a is not empty, so max() will always find a value, and getAsInt() will execute without error.

System.out.println(...)


This is a standard Java statement used to print output to the console.
It will print the integer value obtained from Arrays.stream(a).max().getAsInt().

In Summary:
The entire line System.out.println(Arrays.stream(a).max().getAsInt()); does the following:
Takes the array a.

Converts it into an IntStream.
Finds the maximum value within that stream.
Extracts that maximum value from the OptionalInt container.
Prints the extracted maximum value to the console.
 */