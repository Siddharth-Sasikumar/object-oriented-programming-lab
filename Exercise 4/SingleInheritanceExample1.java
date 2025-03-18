
class Employee {
String name;
int empId;

public Employee(String name, int empId) {
this.name = name;
this.empId = empId;
 }

public void displayDetails() {
System.out.println("Employee Name: " + name);
System.out.println("Employee ID: " + empId);
}
}


class Manager extends Employee {
String department;

public Manager(String name, int empId, String department) {
super(name, empId);
this.department = department;
}

public void displayManagerDetails() {
displayDetails();
System.out.println("Department: " + department);
}
}
public class SingleInheritanceExample1 {
public static void main(String[] args) {
 Manager mgr = new Manager("LEO DAS", 7, "Sales");
mgr.displayManagerDetails();
 }
}
