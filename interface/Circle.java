public class Circle extends Shape {
    private double radius;

    // Circle constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Area of Circle = (pi)r^2
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Perimeter of Circle = 2(pi)r
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Scalable, for scaling the radius
    @Override
    public void scale(double factor) {
        radius *= factor;
    }
}


