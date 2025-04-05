class A {
    String a;
    A(String a) {
        this.a = a;
    }
    void x() {
        System.out.println("Person Name: " + a);
    }
}

class B extends A {
    int b;
    double c;
    B(String a, int b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }
    void y() {
        System.out.println("Employee ID: " + b);
        System.out.println("Salary: $" + c);
    }
}

class C extends B {
    String d;
    C(String a, int b, double c, String d) {
        super(a, b, c);
        this.d = d;
    }
    void z() {
        System.out.println("Department: " + d);
        System.out.println("Role: Manager");
    }
}

public class multilevelinheritance1 {
    public static void main(String[] args) {
        C obj = new C("Bob", 1022, 92000, "Sales");
        obj.x();
        obj.y();
        obj.z();
    }
}

