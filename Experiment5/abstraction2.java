abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    Circle(String color) {
        super(color);
    }

    void draw() {
        System.out.println("Drawing a " + color + " circle");
    }
}

public class abstraction2{
    public static void main(String[] args) {
        Shape shape = new Circle("black");
        shape.draw();
    }
}