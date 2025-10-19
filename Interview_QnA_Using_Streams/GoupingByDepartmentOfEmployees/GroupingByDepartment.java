import java.util.List;
import java.util.ArrayList;
import java.util.Arrays; // Needed for Arrays.asList()
import java.util.Map;
import java.util.stream.Collectors; // Needed for Collectors

// 1. Employee Class (Good as is, but added a toString() for easy printing)
class Employee {
    int id;
    String name;
    String dep;
    double salary;
    
    // Constructor (Already correct)
    public Employee(int id, String name, String dep, double salary) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }
    
    // Getter methods are essential for Java Stream methods like groupingBy and averagingDouble
    public String getDep() {
        return dep;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

// 2. Main Class for Grouping Logic
public class GroupingByDepartment {
    public static void main(String[] args) {
        // Fix: Use Arrays.asList() instead of just asList()
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Jeff", "IT", 120000.00),
            new Employee(2, "Steve", "HR", 350000.00),
            new Employee(3, "Larry", "Service", 450000.00), // Added .00 for consistency
            new Employee(4, "Sam", "IT", 560000.00),       // Adjusted value for realism
            new Employee(5, "Jenson", "HR", 900000.00)      // Adjusted value for realism
        );
        
        // --- Core Logic: Grouping and Averaging ---
        
        // Map<String, Double> where String is the Department and Double is the Average Salary
        Map<String, Double> averageSalariesByDepartment = employees.stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getDep, // Key: Group by the result of the getDep() method
                    Collectors.averagingDouble(Employee::getSalary) // Value: Calculate the average salary in that group
                )
            );
            
        System.out.println("--- Average Salary by Department ---");
        averageSalariesByDepartment.forEach(
            (department, avgSalary) -> System.out.printf("Department %-7s: $%.2f%n", department, avgSalary)
        );

        // --- Alternative Logic: Grouping to get a LIST of Employees ---
        
        // Map<String, List<Employee>> where String is the Department and Value is the List of Employees
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDep));
        
        System.out.println("\n--- Employees Grouped by Department ---");
        employeesByDepartment.forEach((department, employeeList) -> {
            System.out.println("Department: " + department + " (Count: " + employeeList.size() + ")");
            employeeList.forEach(employee -> System.out.println("  " + employee));
        });
    }
}