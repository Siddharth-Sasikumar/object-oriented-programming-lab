abstract class A {
    abstract void x();
    void y() {
    System.out.println("Powering the device...");
    }
    }
    
    class B extends A {
    void x() {
    System.out.println("Laptop is booting...");
    }
    }
    
    public class abstraction4 {
    public static void main(String[] args) {
    A obj = new B();
    obj.x();
    obj.y();
    }
    }
    