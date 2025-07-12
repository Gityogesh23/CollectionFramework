
//java program usin java 8 to che if even numbers are present in a list using AnyMany()
//also explore -->allMatch(),nonMatch()
import java.util.Arrays;
import java.util.List;

public class AnyMatchEven {
   List<Integer>l=Arrays.asList(12,23,45,11,23,24,46,68,98,70,89,99,88,66,44,100);
    
}



/*
 They are compelling when combined with stream operations, such as filter() and map(), to 
 perform more complex transformations and calculations on stream elements.

A) allMatch()
The allMatch() method evaluates whether all elements in the stream satisfy a specified 
predicate. It returns true if all elements match the predicate, and false otherwise. 
The predicate is an inline lambda expression or a method reference that takes an element 
of the stream as its argument and returns a boolean value. If the stream is empty, 
allMatch() returns true.

Syntax: boolean allMatch(Predicate<? super T> predicate)
ex.//1. Check if all words have length more than 2
List<String> words = Arrays.asList("apple", "banana", "cherry");
boolean allMatchLength = words.stream().allMatch(word -> word.length() > 2);
System.out.println(allMatchLength); // Output: true


B)noneMatch()
The noneMatch() method checks if none of the elements in the stream match a specified 
predicate. It returns true if none of the elements match the predicate, and false otherwise. 
The predicate is an inline lambda expression or a method reference that takes an element 
of the stream as its argument and returns a boolean value. If the stream is empty, 
noneMatch() returns true.

Syntax:boolean allMatch(Predicate<? super T> predicate)

//1. Check if all words have length more than 2
List<String> words = Arrays.asList("apple", "banana", "cherry");
boolean allMatchLength = words.stream().allMatch(word -> word.length() > 2);
System.out.println(allMatchLength); // Output: true

C)noneMatch()
The noneMatch() method checks if none of the elements in the stream match a specified 
predicate. It returns true if none of the elements match the predicate, and false 
otherwise. The predicate is an inline lambda expression or a method reference that 
takes an element of the stream as its argument and returns a boolean value. If the stream 
is empty, noneMatch() returns true.

Syntax: boolean noneMatch(Predicate<? super T> predicate)
Example:

//1. Check if all the fruit names are uppercase
List<String> fruits = Arrays.asList("apple", "banana", "cherry");

boolean noneMatchUpperCase = fruits.stream().noneMatch(fruit -> fruit.equals(fruit.toUpperCase()));
System.out.println(noneMatchUpperCase); // Output: true

 */