// The class for a point in 2D space
public class Point {
    //Privates for X and Y
    private float x;
    private float y;

    // A constructor for X and Y
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Constructor to place the point at 0.0f, 0.0f
    public Point() {
        this(0.0f, 0.0f);
    }

    // Getters and Setters below:

    public float getX() {
        return x;
    }


    public void setX(float x) {
        this.x = x;
    }


    public float getY() {
        return y;
    }


    public void setY(float y) {
        this.y = y;
    }

    // Setting both X and Y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getting both X and Y
    public float[] getXY() {
        return new float[] { x, y };
    }

    // Override and toString
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}


