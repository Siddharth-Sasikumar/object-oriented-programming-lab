 class M {
    String a;
    M(String a) {
    this.a = a;
    }
    void f() {
    System.out.println("Device: " + a);
    }
    }
    
    class N extends M {
    N(String a) {
    super(a);
    }
    void g() {
    System.out.println("RAM: 16GB");
    }
    }
    
    class O extends M {
    O(String a) {
    super(a);
    }
    void h() {
    System.out.println("Storage: 128GB");
    }
    }
    
    public class hierarcalinheritance2 {
    public static void main(String[] args) {
    N l = new N("Laptop");
    O m = new O("Mobile");
    l.f();
    l.g();
    m.f();
    m.h();
    }
    }
     
    

