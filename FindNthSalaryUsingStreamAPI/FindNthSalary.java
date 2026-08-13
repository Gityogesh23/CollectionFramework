// package FindNthSalaryUsingStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class Employee{
String name;
double salary;
Employee(String name,double salary){
    this.name=name;
    this.salary=salary;
}
Employee(){

}
public String getName(){
  return name;  
}
public double getSalary(){
    return salary;
  }
}
public class FindNthSalary {
    public static void main(String[]args){
        List<Employee>employees=Arrays.asList(
        new Employee("Alice",50000.00),
        new Employee("John",80000.00),
        new Employee("Charlie", 75000), // Duplicate salary test case
        new Employee("Yogesh",1000000.00)

        );
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rank (e.g 2 for 2nd highest): ");
        int n=sc.nextInt();

       // Optional<Double> getNthSalariedEmployee=employees.stream()
       Optional<Employee>getNthSalariedEmployee=employees.stream()
                 //.map(Employee::getSalary) //calling getSalary on each Employee instance.
                 .distinct() //to avoid duplicates
                 //.sorted(Comparator.reverseOrder()) // Sort numbers descending,return salary of type Double object
                 .sorted(Comparator.comparing(Employee::getSalary).reversed())
                 .skip(n-1) // Skip first N-1 elements
                 .findFirst();// Get N-th element

                 getNthSalariedEmployee.ifPresentOrElse(
                    emp->System.out.println(n+"th salary "+emp.getName()+"-"+emp.getSalary()),
                    ()->System.out.println("Not enough distinct slaries to determine :"+n+"highst salary.")
                 );
                //  If Optional contains a value, the first lambda runs, with salary bound to that value.
                //  If Optional is empty, the second lambda (no arguments, hence ()) runs instead.
                //What is Optional: Optional<T> Optional is a container Object
                // 
                // 1)holds Value of Type T. or 2)holds nothing(is "empty").
                //It exixtes to represent
                sc.close();
    }

}
/*
How reversed sorting works:
// Extract double values first, then sort numbers descending
.map(Employee::getSalary)
.sorted(Comparator.reverseOrder())

1) .map(Employee::getSalary) transforms the Stream<Employee> into a Stream<Double> by calling getSalary() on every employee once.
Note :Employee::getSalary is a method reference, shorthand for the lambda employee -> employee.getSalary(). 
Since getSalary() returns double, calling it on every Employee and collecting the results turns your Stream<Employee> into a Stream<Double>.
Kindly ** :
(Note: getSalary() returns a primitive double, but Java streams can't hold primitives directly in a generic 
Stream<T>, so Java autoboxes each double into a Double object. That's why you end up with Stream<Double>, 
not Stream<double>.)
So after this line, you no longer have Employee objects in the pipeline — just their salary values.

2) .sorted(Comparator.reverseOrder()) receives a stream of raw Double numbers and compares two Double objects directly—getSalary() is already finished by this step.
*/