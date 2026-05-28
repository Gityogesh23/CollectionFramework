import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {

    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class HighestSalEmployee {

    public static void main(String[] args) {

        List<Employee> employees = getSampleEmployees();

        Optional<Employee> highestSalaryEmployee =
                employees.stream()
                        .max(Comparator.comparingDouble(Employee::getSalary));

        highestSalaryEmployee.ifPresent(emp -> {
            System.out.println("Name       : " + emp.getName());
            System.out.println("Department : " + emp.getDepartment());
            System.out.println("Salary     : " + emp.getSalary());
        });
    }

    public static List<Employee> getSampleEmployees() {

        return Arrays.asList(
                new Employee("Yogesh", "ImprovesT", 85000),
                new Employee("Rahul", "IT", 95000),
                new Employee("Priya", "HR", 65000),
                new Employee("Ankit", "HR", 72000),
                new Employee("Sneha", "Finance", 90000),
                new Employee("Amit", "Finance", 88000)
        );
    }
}
/*
1. java.util.Optional ClassIntroduced in Java 8, java.util.Optional<T> is a container 
object used to represent a value that may or may not be present. It is primarily intended 
as a method return type to explicitly warn API consumers that a "no result" state is 
possible, helping to avoid NullPointerException.Common methods documented in its Oracle 
Javadoc include:isPresent(): Returns true if a value is present.
ifPresent(Consumer action): Performs an action if a value exists.orElse(T other): Returns 
the value if present, or a default value otherwise.ofNullable(T value): Creates an 
Optional that may contain a null value.
*/