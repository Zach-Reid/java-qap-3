public class Demo {
    
    // Static method to scale all Scalable objects in an array
    public static void scaleShapes(Scalable[] scalableShapes, double factor) {
        for (Scalable shape : scalableShapes) {
            System.out.println("Before scaling:");
            System.out.println(shape);
            System.out.println();
            
            // Scale the shape
            shape.scale(factor);
            
            System.out.println("After scaling:");
            System.out.println(shape);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Make the different types of shapes
        Shape circle = new Circle(5);
        Shape ellipse = new Ellipse(6, 4);
        Shape triangle = new Triangle(3, 4, 5);
        Shape equilateralTriangle = new EquilateralTriangle(6);

        // Store them in an array of Scalable types
        Scalable[] shapes = { (Scalable) circle, (Scalable) ellipse, (Scalable) triangle, (Scalable) equilateralTriangle };

        // Call the static method to scale the shapes
        scaleShapes(shapes, 2.0);  // Goes by a factor of 2
    }
}



