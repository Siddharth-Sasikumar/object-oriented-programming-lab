interface Engine {
    void start();
}

interface Wheels {
    void rotate();
}

class Bike implements Engine, Wheels {
    public void start() {
        System.out.println("Bike engine starting...");
    }

    public void rotate() {
        System.out.println("Bike wheels rotating...");
    }
}

public class interface1{
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start();
        myBike.rotate();
    }
}
