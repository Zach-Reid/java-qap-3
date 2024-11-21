public class Demo {
    public static void main(String[] args) {
        // Make the different types of shapes
        Shape circle = new Circle(5);
        Shape ellipse = new Ellipse(6, 4);
        Shape triangle = new Triangle(3, 4, 5);
        Shape equilateralTriangle = new EquilateralTriangle(6);

        // Store them in an array of Shape types
        Shape[] shapes = { circle, ellipse, triangle, equilateralTriangle };

        // Loop through the array and print details
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(); // Empty line for shape clarity
        }
    }
}


