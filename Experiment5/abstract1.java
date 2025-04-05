abstract class M {
    abstract void p();
    void q() {
    System.out.println("Animal is breathing...");
    }
    }
    
    class N extends M {
    void p() {
    System.out.println("Dog is barking...");
    }
    }
    
    public class abstract1 {
    public static void main(String[] args) {
    M a = new N();
    a.p();
    a.q();
    }
    }
    