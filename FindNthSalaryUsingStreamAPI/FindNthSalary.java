package FindNthSalaryUsingStreamAPI;

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
public String getname(){
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

        Optional<Double> getNthSalariedEmployee=employees.stream()
                 .map(Employee::getSalary) //calling getSalary on each Employee instance.
                 .distinct() //to avoid duplicates
                 .sorted(Comparator.reverseOrder()) // Sort numbers descending
                 .skip(n-1) // Skip first N-1 elements
                 .findFirst();// Get N-th element

                 getNthSalariedEmployee.ifPresentOrElse(
                    salary->System.out.println(n+"th salary "+salary),
                    ()->System.out.println("Nnot enough distinct slaries to determine :"+n+"highst salary.")
                 );
                 sc.close();
    }

}
/*
How reversed sorting works:
// Extract double values first, then sort numbers descending
.map(Employee::getSalary)
.sorted(Comparator.reverseOrder())

1) .map(Employee::getSalary) transforms the Stream<Employee> into a Stream<Double> by calling getSalary() on every employee once.

2) .sorted(Comparator.reverseOrder()) receives a stream of raw Double numbers and compares two Double objects directly—getSalary() is already finished by this step.
*/