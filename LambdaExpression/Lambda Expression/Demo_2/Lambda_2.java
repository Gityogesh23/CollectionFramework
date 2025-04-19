/*
Functional interface=>What is a Functional Interface?

A functional interface is an interface that contains exactly one abstract method. It 
can have default methods, static methods, and private methods in addition to the 
single abstract method.
 @FunctionalInterface annotation is optional but highly recommended. It serves two purposes:

Compiler Check: It instructs the compiler to enforce the rule of having only one abstract
 method. If you try to add another abstract method, the compiler will generate an 
 error

 QUE) Why Functional Interfaces are Targets for Lambda Expressions and Method References

Lambda expressions and method references provide a concise way to represent an instance of a functional interface. 
The reason they work is because they essentially provide the implementation for the single abstract method 
defined in the functional interface.

Lambda Expression: A lambda expression is an anonymous function (a function without a name) that can be 
treated as a value. Its syntax is (parameters) -> expression or (parameters) -> { statements; }. 
The parameters and the return type of the lambda expression must be compatible with the single abstract method
of the functional interface it's being assigned to.

Method Reference: A method reference is a shorthand syntax for a lambda expression that simply calls an 
existing method. There are four kinds of method references:

Reference to a static method: ClassName::staticMethodName
Reference to an instance method of a particular object: object::instanceMethodName
Reference to an instance method of an arbitrary object of a particular type: ClassName::instanceMethodName
Reference to a constructor: ClassName::


*/
@FunctionalInterface
 interface StringOperation{
    String operate(String str);
}
public LambdaDemo_2{
    public static void main(String[] args){

        //Assign lambada Expression to StringOperation Interface
        //lambda exprssion Syntax: (parameters...)->(expression);
        //syntax 2)(parameters )->(statement/stmts);
StringOperation toUpperCase= (s)->s.toUpperCase();
    }
}
/*
flow of program=>
Explanation of the Demo:

@FunctionalInterface StringOperation: We define a functional interface named StringOperation with a single abstract method operate that takes a String as input and returns a String.

StringOperation toUpperCase = (s) -> s.toUpperCase();: Here, we assign a lambda expression (s) -> s.toUpperCase() to the toUpperCase variable of type StringOperation.

(s): This represents the input parameter of the lambda expression, which corresponds to the String 
parameter of the operate method.

->: This is the lambda operator.

s.toUpperCase(): This is the body of the lambda expression, which provides the implementation for the 
operate method. It takes the input string s and returns its uppercase version.
StringOperation reverse = (s) -> new StringBuilder(s).reverse().toString();: Similarly, we assign another 
lambda expression to the reverse variable. This lambda reverses the input string.

processString("java", (s) -> "**" + s + "**");: This demonstrates passing a lambda expression directly as an
 argument to a method (processString) that expects a functional interface (StringOperation).

Lambda Expression in Detail

A lambda expression in Java has the following structure:

(parameter list) -> lambda body

Read It Ones To Know The Lambda Expression=>
Think of it like this:

The StringOperation interface sets up a contract: "I need something that can operate on a String." 
The lambda expression provides the implementation of that operation. The parameter s in the lambda is the 
placeholder for the String that will be passed to this operation when the operate method (which the lambda is 
implementing) is eventually called.

Analogy:

Imagine you have a form that asks for a "Name" (of type String). When someone fills out the form, they write 
a specific name (an object of type String). Inside the processing logic for that form, when you refer 
to "Name," you're implicitly referring to the String value that was entered.

Similarly, in the lambda, s is the placeholder for the String that will be provided when the operate 
method is invoked. The compiler knows its type because the StringOperation interface specifies it. 

*/
/*
Lambda Expression in Detail

A lambda expression in Java has the following structure:

(parameter list) -> lambda body
1. Parameter List:

Zero parameters: ()
One parameter: parameter or (parameter) (parentheses are optional for a single parameter)
Multiple parameters: (parameter1, parameter2, ...)
Explicit types (optional but sometimes necessary): (String s, int i)
Type inference: The compiler can often infer the parameter types based on the context of the functional interface's abstract method.

2. Lambda Body:
Single expression: If the body contains a single expression, the result of the expression is automatically returned. You don't need to use the return keyword or curly braces {}.
Example: (s) -> s.length()
Block of statements: If the body contains multiple statements, you need to enclose them in curly braces {} and explicitly use the return keyword if the method is expected to return a value.
Example: (s) -> { String result = s.toUpperCase(); return result; }
Key Benefits of Lambda Expressions:

Concise Code: They allow you to write more compact and readable code compared to anonymous inner classes, which were the traditional way of implementing interfaces with a single method before Java 8.
Functional Programming Style: They facilitate a more functional programming style by treating functions as first-class citizens, allowing you to pass them around and use them like any other value.
Improved Readability: For simple operations, lambda expressions can make the intent of the code clearer.
Enable Parallel Processing: Lambda expressions, in conjunction with the Stream API, make it easier to perform operations in parallel.
In summary, functional interfaces are the cornerstone for using lambda expressions and method references in Java. They provide the target type for these concise representations of behavior, making the code more expressive and enabling functional programming paradigms.


*/