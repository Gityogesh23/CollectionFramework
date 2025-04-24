

import java.util.Arrays; //they are used in commented codes
import java.util.List;
import java.util.function.Consumer;

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
//Instead of .map(n -> Utils.square(n)), we use Utils::square
    }
 }

/* 
//2. Reference to an instance method of a particular object==>instance::instanceMethod	==>System.out::println
public class Demo {
    public void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Consumer<String> greeter = demo::greet;
        greeter.accept("Yogesh");
//Equivalent to: Consumer<String> greeter = name -> demo.greet(name);//
    }
}
*/

// 3. Reference to an Instance Method of an Arbitrary Object of a Clas
/* 
//🔸 4. Reference to a Constructor
import java.util.function.Supplier;

class Employee {
    public Employee() {
        System.out.println("Employee created!");
    }
}

public class Demo {
    public static void main(String[] args) {
        Supplier<Employee> empSupplier = Employee::new;
        empSupplier.get(); // Creates new Employee
    }
}
*/
