class overloading {
    String x;
    int y;
    overloading(String x) {
    this.x = x;
    System.out.println("Name: " + x);
    }
    overloading(String x, int y) {
    this.x = x;
    this.y = y;
    System.out.println("Name: " + x);
    System.out.println("ID: " + y);
    }
    public static void main(String[] args) {
        overloading obj1 = new overloading("Dhoni");
        overloading obj2 = new overloading("Virat", 18);
    }
    }
    