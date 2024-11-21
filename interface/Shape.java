// Abstract class with the Scalable support
public abstract class Shape implements Scalable {
    protected String name;

    // Constructor for the shape
    public Shape(String name) {
        this.name = name;
    }

    // The methods for calculating area/perimeter
    public abstract double area();
    public abstract double perimeter();

    // Added scale override
    @Override
    public abstract void scale(double factor);

    // Overridde, toString
    @Override
    public String toString() {
        return "Shape: " + name + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}


