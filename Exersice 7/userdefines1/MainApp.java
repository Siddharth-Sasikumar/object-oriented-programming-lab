import mypackage.packageone;

public class MainApp {
    public static void main(String[] args) {
        packageone calc = new packageone();
        int result1 = calc.add(10, 5);
        int result2 = calc.multiply(6, 7);

        System.out.println("Addition: " + result1);
        System.out.println("Multiplication: " + result2);
    }
}
