// Abstract class for the Shape
public abstract class Shape {
    protected String name;  // Instance variable for the name

    // Constructor for the shape
    public Shape(String name) {
        this.name = name;
    }

    // The methods for calculating area/perimeter
    public abstract double area();
    public abstract double perimeter();

    // Overridde, toString
    @Override
    public String toString() {
        return "Shape: " + name + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}


