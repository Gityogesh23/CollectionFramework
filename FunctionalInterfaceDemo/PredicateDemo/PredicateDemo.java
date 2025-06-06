/*
 What is a Predicate?
A Predicate<T> represents a boolean-valued function of one argument.
It is used for filtering, conditional checks, etc.
Commonly used in Streams, filtering collections, etc.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] Strings){
    //define Predicte to check a number is even
    Predicate<Integer>isEven=num->num%2==0;
    
    //Ex usage
    int number=10;
    System.out.println("Is "+number+"even ?"+isEven.test(number));

    //using Predicate with filter in stream
    List<Integer>numbers=Arrays.asList(1,2,3,4,5,6);
    
    List<Integer>evenNumbers=numbers.stream()
                                    .filter(isEven)
                                    .collect(Collectors.toList());
    System.out.println("Even Numbers Are: "+evenNumbers);//[2,4,6]

    //Predicate to check if a string is nin-empty
    Predicate<String>isNonEmpty=str->!str.isEmpty();

    System.out.println("Is 'Hello' non-empty? " + isNonEmpty.test("Hello")); // true
    System.out.println("Is '' non-empty? " + isNonEmpty.test("")); // false
    } 
}
/*
 Explanation:
Predicate<Integer> isEven = num -> num % 2 == 0;
Lambda checks if a number is even.

.filter(isEven)
Filters the list to only include even numbers.

test()
Executes the predicate on a single input.
 */