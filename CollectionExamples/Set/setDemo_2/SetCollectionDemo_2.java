
// Custom class

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // For printing the object
    @Override
    public String toString() {
        return id + " - " + name + " - $" + salary;
    }
}

public class SetCollectionDemo_2  {
    public static void main(String[] args) {

        // Comparator to sort Employees by salary (ascending)
        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.salary == e2.salary)
                    return e1.id - e2.id; // Ensure unique keys (to avoid duplicates)
                return Double.compare(e1.salary, e2.salary);
            }
        };

        // TreeSet with custom comparator
        Set<Employee> employeeSet = new TreeSet<>(salaryComparator);

        employeeSet.add(new Employee(101, "Alice", 75000));
        employeeSet.add(new Employee(102, "Bob", 60000));
        employeeSet.add(new Employee(103, "Charlie", 85000));
        employeeSet.add(new Employee(104, "David", 60000)); // Same salary as Bob but different ID

        // Printing elements in sorted order
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }
    }
}
