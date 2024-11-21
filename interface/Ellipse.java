public class Ellipse extends Shape {
    private double a, b; // A major and minor axis

    // Constructor (that makes sure A is the larger axis)
    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a < b) {
            this.a = b;
            this.b = a;
        } else {
            this.a = a;
            this.b = b;
        }
    }

    // Area of Ellipse = (pi)ab
    @Override
    public double area() {
        return Math.PI * a * b;
    }

    // Perimeter of Ellipse = (pi) * (3(a+b) - √((3a+b)(a+3b)))
    @Override
    public double perimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b))) / 2;
    }

    // Scale both axes by the given scale factor
    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}


