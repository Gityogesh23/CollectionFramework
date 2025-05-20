//prob statement=>print the employee salary greter than 50000


import java.util.Arrays;
import java.util.List;
class Employee{
    private String name;
    private double salary;
    void Employee(){}

    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

    //getter method=>we require getter method only
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
@Override
public String toString(){
    return "Employee{' name= "+name+"\t"+"salary = "+salary+"}";
}
}


public class StreamApiDemo_1 {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("Yogesh", 45000),
            new Employee("Priya", 55000),
            new Employee("Raj", 60000),
            new Employee("Neha", 40000)
            );
            employees.stream()
            .filter(emp -> emp.getSalary() > 50000)
            .forEach(System.out::println); // Uses toString() method
            //.forEach(emp -> System.out.println(emp.getName() + ": ₹" + emp.getSalary()));
}    
}
/*
 So, how can List.of() or Arrays.asList() seemingly "create" a List?

The key lies in the fact that these are static factory methods, and they return an object 
of a concrete class that implements the List interface, not an instance of the List 
interface itself.

Let's clarify for both List.of() and Arrays.asList():

1. List.of() (Java 9+)
The List.of() method is a static method defined directly within the List interface 
itself (since Java 9).

Its signature is:

Java

public static <E> List<E> of(E... elements)
How it works:

When you call List.of("A", "B", "C"), you are calling a static method on the List 
interface.
This static method internally creates an instance of a private, immutable implementation 
class that lives within the Java runtime. You, as the developer, don't directly see or 
interact with the name of this internal class.
This internal class implements the List interface.
The List.of() method then returns a reference to an object of this internal, 
anonymous (or effectively anonymous to you) concrete class.
Because this returned object implements List, you can assign it to a List reference:
Java

List<String> myImmutableList = List.of("A", "B", "C");
// myImmutableList is a reference to an object of type
// java.util.ImmutableCollections$ListN (or similar internal class)
// which *implements* java.util.List
Analogy: Think of it like a car manufacturing plant. You don't buy a "Car" interface; 
you buy a specific model like a "Toyota Corolla" or a "Honda Civic." The List.of() method 
is like a "factory" that produces pre-configured "List" objects (like the specific car 
models), and all these models conform to the "Car" interface. You ask the factory for a 
"List," and it gives you a concrete object that is a List.

2. Arrays.asList()
The Arrays.asList() method is a static method in the java.util.Arrays utility class.

Its signature is:

Java

public static <T> List<T> asList(T... a)
How it works:

When you call Arrays.asList("X", "Y", "Z"), you are calling a static method on the 
Arrays class.
This method internally creates an instance of a private static nested class 
called java.util.Arrays.ArrayList.
This java.util.Arrays.ArrayList class implements the List interface.
The Arrays.asList() method returns a reference to an object of this java.util.Arrays.ArrayList 
class.
Again, because this returned object implements List, you can assign it to a List reference:
Java:

List<String> myFixedSizeList = Arrays.asList("X", "Y", "Z");
// myFixedSizeList is a reference to an object of type
// java.util.Arrays.ArrayList (the nested class)
// which *implements* java.util.List
The Concept of Polymorphism
This entire mechanism is a perfect example of polymorphism in action.

You declare a variable of the interface type (List<Employee>).
You assign to it an object of a concrete class (e.g., the internal class returned by List.of() or Arrays.asList()) that implements that interface.
This allows you to work with the object through the List interface methods (like get(), size(), stream(), etc.) without needing to know the specific underlying implementation class. This is a core principle of good object-oriented design: program to interfaces, not implementations.
 */