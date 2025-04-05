class A {
    String a;
    A(String a) {
    this.a = a;
    }
    void x() {
    System.out.println("Animal: " + a);
    }
    }
    
    class B extends A {
    B(String a) {
    super(a);
    }
    void y() {
    System.out.println("Sound: Bark");
    }
    }
    
    class C extends A {
    C(String a) {
    super(a);
    }
    void z() {
    System.out.println("Sound: Meow");
    }
    }
    
    public class Hierarcalinheritance1 {
    public static void main(String[] args) {
    B d = new B("Dog");
    C c = new C("Cat");
    d.x();
    d.y();
    c.x();
    c.z();
    }
    }
    
