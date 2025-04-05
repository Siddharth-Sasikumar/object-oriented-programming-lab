class X {
    String a;
    X(String a) {
        this.a = a;
    }
    void m() {
        System.out.println("Vehicle Type: " + a);
    }
}

class Y extends X {
    String b;
    int c;
    Y(String a, String b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }
    void n() {
        System.out.println("Car Model: " + b);
        System.out.println("Year: " + c);
    }
}

class Z extends Y {
    int d;
    Z(String a, String b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }
    void o() {
        System.out.println("Battery Capacity: " + d + " kWh");
        System.out.println("Type: Electric Car");
    }
}

public class multilevelinheritance2 {
    public static void main(String[] args) {
        Z obj = new Z("Four Wheeler", "BYD", 2023, 85);
        obj.m();
        obj.n();
        obj.o();
    }
}

