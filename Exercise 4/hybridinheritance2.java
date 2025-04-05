class X {
    String a;
    X(String a) {
    this.a = a;
    }
    void m() {
    System.out.println("Appliance: " + a);
    }
    }
    
    class Y extends X {
    int b;
    Y(String a, int b) {
    super(a);
    this.b = b;
    }
    void n() {
    System.out.println("Capacity: " + b + " kg");
    }
    }
    
    class Z {
    String c;
    Z(String c) {
    this.c = c;
    }
    void o() {
    System.out.println("Feature: " + c);
    }
    }
    
    class W extends Y {
    Z obj;
    W(String a, int b, String c) {
    super(a, b);
    obj = new Z(c);
    }
    void p() {
    m();
    n();
    obj.o();
    System.out.println("Type: Smart Washing Machine");
    }
    }
    
    public class hybridinheritance2 {
    public static void main(String[] args) {
    W w = new W("WasherX", 7, "Wi-Fi Enabled");
    w.p();
    }
    }
    