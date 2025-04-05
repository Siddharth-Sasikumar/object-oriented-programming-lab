interface Bank {
    void interest();
    }
    
    class Savings implements Bank {
    double amount;
    Savings(double amount) {
    this.amount = amount;
    }
    public void interest() {
    System.out.println("Savings Interest: " + (amount * 0.05));
    }
    }
    
    class Current implements Bank {
    double amount;
    Current(double amount) {
    this.amount = amount;
    }
    public void interest() {
    System.out.println("Current Interest: " + (amount * 0.02));
    }
    }
    
    public class interface3 {
    public static void main(String[] args) {
    Savings s = new Savings(10000);
    s.interest();
    Current c = new Current(15000);
    c.interest();
    }
    }
    