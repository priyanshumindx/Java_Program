class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}