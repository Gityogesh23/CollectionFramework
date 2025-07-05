//How to convert list of objects into a Map by considering duplicated keys and store them in sorted order ?
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Employee{
    int empId;
    String empName;
    double empSalary;
public Employee(int empId,String empName,double empSalary){
    this.empId=empId;
    this.empName=empName;
    this.empSalary=empSalary;
}

@Override
public String toString(){
return "Employee_Record : [empId = "+empId+ ",empName=  "+empName+",empSalary=  " +empSalary+ " ]";
}

}

public class ListToMap {
    public static void main(String[] args) {
        List<Employee>employees=new ArrayList<Employee>();

        employees.add(new Employee(1,"Alice",80000.00));
        employees.add(new Employee(2,"Linus Torvald-sir",1000000.05));
        employees.add(new Employee(1,"Bill Gates-sir",50000.06));
        employees.add(new Employee(2,"jeff Bezos-sir",600000.80));
        
        //mapping List of Objects into a map by considering duplicate keys how ?just refer code next==>
        Map<Integer,List<Employee>>sortedMap=employees.stream()
        .collect(Collectors.groupingBy(s->s.empId, TreeMap::new,Collectors.toList()));
        
        //System.out.println(sortedMap);

        sortedMap.forEach((id,empList) -> System.out.println("ID: "+id+" ->"+empList));
    }   
}
