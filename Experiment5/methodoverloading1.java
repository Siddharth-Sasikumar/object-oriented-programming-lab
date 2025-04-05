class Employee {
    private String name;
    private int id;
    private double salary;
    void setDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void setDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void setDetails(String name) {
        this.name = name;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
public class methodoverloading1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setDetails("siddharth", 101);
        emp1.displayDetails();
        Employee emp2 = new Employee();
        emp2.setDetails("srini", 102, 50000.0);
        emp2.displayDetails();
        Employee emp3 = new Employee();
        emp3.setDetails("raaghav"); 
        emp3.displayDetails();
    }
}