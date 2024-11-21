// Class for a movable point
public class MovablePoint extends Point { //As seen, it extends Point
    // Private variables for X/Y speed
    private float xSpeed;
    private float ySpeed;

// Constructors below!
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Super from Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Initialize the speed, at the default point 0.0f, 0.0f
    public MovablePoint(float xSpeed, float ySpeed) {
        super(); // Default point from Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor to initialize at a set point and set speed
    public MovablePoint() {
        super(); //From Point
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Getter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter for xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter for ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Setting both ySpeed and xSpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // For getting the speed as an array
    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }

    // Override and toString again
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }

    // Method to move the point by the set speed and update the position
    public MovablePoint move() {
        setX(getX() + xSpeed);  // The x coordinate
        setY(getY() + ySpeed);  // And the y coordinate
        return this; 
    }
}


