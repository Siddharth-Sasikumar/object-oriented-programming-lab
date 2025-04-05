interface Person {
    void details();
    }
    
    class Teacher implements Person {
    String name;
    int id;
    Teacher(String name, int id) {
    this.name = name;
    this.id = id;
    }
    public void details() {
    System.out.println("Teacher Name: " + name + ", ID: " + id);
    }
    }
    
    class Engineer implements Person {
    String name;
    String dept;
    Engineer(String name, String dept) {
    this.name = name;
    this.dept = dept;
    }
    public void details() {
    System.out.println("Engineer Name: " + name + ", Department: " + dept);
    }
    }
    
    public class interface4 {
    public static void main(String[] args) {
    Teacher t = new Teacher("Ravi", 101);
    t.details();
    Engineer e = new Engineer("Maya", "Software");
    e.details();
    }
    }
    