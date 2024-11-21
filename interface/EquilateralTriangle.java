public class EquilateralTriangle extends Triangle {

    // Constructor (all sides are equal for an Equilateral Triangle)
    public EquilateralTriangle(double side) {
        super(side, side, side);
        super.name = "Equilateral Triangle";  // Override the name to specify
    }

    // Scale the sides of the triangle
    @Override
    public void scale(double factor) {
        super.scale(factor); // Scale all three of the sides
    }
}


