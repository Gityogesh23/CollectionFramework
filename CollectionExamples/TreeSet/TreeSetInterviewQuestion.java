/*
 The Question:
"You have a list of employees with their names and salaries. Use TreeSet to sort 
employees by salary in descending order. If two employees have the same salary, 
sort them alphabetically by name. Then demonstrate how to find employees with the 
highest and lowest salaries, and how to get all employees with salaries below a 
certain threshold."
 */
import java.util.*;

public class TreeSetInterviewQuestion {
    public static void main(String[] args) {
        // Given a list of employees with names and salaries
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 75000),
            new Employee("Bob", 85000),
            new Employee("Charlie", 65000),
            new Employee("Diana", 95000),
            new Employee("Eve", 75000),  // Note: Same salary as Alice
            new Employee("Frank", 60000)
        );
        
        System.out.println("Original employees list:");
        employees.forEach(System.out::println);
        
        // Interview question: Use TreeSet to get employees sorted by salary in descending order
        // Handle employees with the same salary by sorting them alphabetically
        
        // Solution: Create custom Comparator for TreeSet
        TreeSet<Employee> sortedEmployees = new TreeSet<>(
            new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    // Primary sort by salary (descending)
                    int salaryComparison = Integer.compare(e2.getSalary(), e1.getSalary());
                    
                    // Secondary sort by name (ascending) if salaries are equal
                    if (salaryComparison == 0) {
                        return e1.getName().compareTo(e2.getName());
                    }
                    
                    return salaryComparison;
                }
            }
        );
        
        // Add all employees to TreeSet
        sortedEmployees.addAll(employees);
        
        System.out.println("\nEmployees sorted by salary (descending) and name (ascending):");
        sortedEmployees.forEach(System.out::println);
        
        // Additional operations often asked in interviews
        
        // Find and print employee with highest salary
        System.out.println("\nEmployee with highest salary: " + sortedEmployees.first());
        
        // Find and print employee with lowest salary
        System.out.println("Employee with lowest salary: " + sortedEmployees.last());
        
        // Finding employees with salary less than 80000
        System.out.println("\nEmployees with salary less than 80000:");
        Employee threshold = new Employee("", 80000);
        SortedSet<Employee> lowerSalaries = sortedEmployees.tailSet(threshold);
        lowerSalaries.forEach(System.out::println);
    }
}

class Employee {
    private String name;
    private int salary;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return name + " - $" + salary;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}