package CollectionExamples.MethodReference;

import java.util.Arrays;
import java.util.List;

/*
before Method reference you must know the Lambda EXpression.
 first what is Method refernce:
 A method reference is a shortcut to call a method using a lambda expression. It refers to a method without executing it and allows cleaner, 
 more readable code.

  Types of Method References:

Type	                                                                      Syntax	                        Example
1. Reference to a static method	 ====>                                       ClassName::staticMethod	==>         Math::sqrt
2. Reference to an instance method of a particular object==>	             instance::instanceMethod	    ==>           System.out::println
3. Reference to an instance method of an arbitrary object of a particular type==>ClassName::instanceMethod	String::length
4. Reference to a constructor	  ==>                                               ClassName::new	ArrayList::new

 */
class Utils {
    public static int square(int x) {
        return x * x;
    }
}
//1. Reference to a static method	 ====> ClassName::staticMethod ==>Math::sqrt

public class Demo_1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4);

        // Using method reference instead of lambda
        nums.stream().map(Utils::square).forEach(System.out::println);
    }
 }

