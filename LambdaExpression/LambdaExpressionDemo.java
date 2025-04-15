package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        // Example 1: Basic Lambda Syntax
        System.out.println("=== Basic Lambda Examples ===");
        
        // Traditional anonymous class
        Runnable traditionalRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Traditional anonymous runnable executed");
            }
        };
        
        // Lambda expression - concise way to represent anonymous classes
        Runnable lambdaRunnable = () -> System.out.println("Lambda runnable executed");
        
        traditionalRunnable.run();
        lambdaRunnable.run();
        
        // Example 2: Lambda with parameters
        System.out.println("\n=== Lambda With Parameters ===");
        
        // Interface with a method that takes parameters
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        
        System.out.println("Addition: " + addition.calculate(10, 5));       // 15
        System.out.println("Subtraction: " + subtraction.calculate(10, 5)); // 5
        
        // Example 3: Using Lambda with Collections
        System.out.println("\n=== Lambda with Collections ===");
        
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "David");
        
        // Traditional loop
        System.out.println("Traditional loop:");
        for (String name : names) {
            System.out.println(name);
        }
        
        // Using lambda with forEach
        System.out.println("\nLambda forEach:");
        names.forEach(name -> System.out.println(name));
        
        // Method reference - even more concise
        System.out.println("\nMethod reference:");
        names.forEach(System.out::println);
        
        // Example 4: Stream API with lambdas
        System.out.println("\n=== Stream API with Lambdas ===");
        
        // Filter names starting with 'A' and convert to uppercase
        System.out.println("Filtered and mapped names:");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .map(String::toUpperCase)
             .forEach(System.out::println);
        
        // Example 5: Functional Interfaces in java.util.function
        System.out.println("\n=== Functional Interfaces ===");
        
        // Predicate - takes one argument and returns boolean
        Predicate<String> startsWithB = s -> s.startsWith("B");
        System.out.println("Does 'Bob' start with B? " + startsWithB.test("Bob"));
        
        // Consumer - takes one argument and returns nothing
        Consumer<String> printer = s -> System.out.println("Consuming: " + s);
        printer.accept("Hello Lambda");
        
        // Function - takes one argument and returns a result
        Function<String, Integer> lengthFunction = s -> s.length();
        System.out.println("Length of 'Hello': " + lengthFunction.apply("Hello"));
        
        // Supplier - takes no argument and returns a result
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random value: " + randomSupplier.get());
        
        // Example 6: Variable capture
        System.out.println("\n=== Variable Capture ===");
        
        String prefix = "User: ";
        // Lambda can access variables from the enclosing scope (must be effectively final)
        names.forEach(name -> System.out.println(prefix + name));
        
        // Example 7: Custom sorting with lambda
        System.out.println("\n=== Custom Sorting ===");
        
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 28));
        people.add(new Person("Alice", 23));
        people.add(new Person("Bob", 31));
        
        // Sort by age using lambda
        people.sort((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println("Sorted by age:");
        people.forEach(p -> System.out.println(p.getName() + ": " + p.getAge()));
        
        // Sort by name
        people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("\nSorted by name:");
        people.forEach(p -> System.out.println(p.getName() + ": " + p.getAge()));
    }
    
    // Functional interface for our calculator example
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }
    
    // Person class for sorting example
    static class Person {
        private String name;
        private int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
    }
}