public class Triangle extends Shape {
    private double side1, side2, side3;

    // Triangle Construction Zone
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error: The sides do not form a valid triangle.");
            System.exit(0); // If it doesn't make a valid triangle, kick them out
        }
    }

    // Semi-perimeter for calculating area
    private double semiPerimeter() {
        return (side1 + side2 + side3) / 2;
    }

    // Triangle Area
    @Override
    public double area() {
        double s = semiPerimeter();
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Perimeter of Triangle = side1 + side2 + side3
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    // Scaling all sides by a given factor
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}


