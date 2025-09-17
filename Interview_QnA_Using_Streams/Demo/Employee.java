public class Employee{
int empid;
double salary;

Employee(int empid,double salary){
this.empid=empid;
this.salary=salary;

}

public void display (){
 System.out.println("display the employee details :" +"empid = "+empid+ ", employee_salary = " +salary );
}
public static void main(String[] args){
    Employee emp1=new Employee(101,30000.00);
    emp1.display();
}
}