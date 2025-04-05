class A {
    String a;
    A(String a) {
    this.a = a;
    }
    void p() {
    System.out.println("Name: " + a);
    }
    }
    
    class B extends A {
    int b;
    B(String a, int b) {
    super(a);
    this.b = b;
    }
    void q() {
    System.out.println("ID: " + b);
    }
    }
    
    class C {
    double c;
    C(double c) {
    this.c = c;
    }
    void r() {
    System.out.println("Score: " + c);
    }
    }
    
    class D extends B {
    C obj;
    D(String a, int b, double c) {
    super(a, b);
    obj = new C(c);
    }
    void s() {
    p();
    q();
    obj.r();
    System.out.println("Category: Final");
    }
    }
    
    public class hybridinheritance1 {
    public static void main(String[] args) {
    D x = new D("Siddharth", 505, 91.7);
    x.s();
    }
    }
    
