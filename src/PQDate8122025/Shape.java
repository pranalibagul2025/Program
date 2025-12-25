package PQDate8122025;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}   // <-- IMPORTANT: Rectangle class ends here

// Now create TestShape OUTSIDE
class TestShape {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        c.area();
        r.area();
    }
}

