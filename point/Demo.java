public class Demo {
    public static void main(String[] args) {
        // Create a Point object with specific coordinates
        Point p1 = new Point(2.5f, 3.5f);
        System.out.println("Point p1: " + p1); // Should be (2.5, 3.5)

        // Create the MovablePoint with specific set coordinates and a set speed
        MovablePoint mp1 = new MovablePoint(1.0f, 1.0f, 0.5f, 0.5f);
        System.out.println("MovablePoint mp1: " + mp1); // Position should be (1.0, 1.0), and have a speed of (0.5, 0.5)

        // Move it and print the update
        mp1.move();
        System.out.println("After moving, MovablePoint mp1: " + mp1); // (1.5, 1.5), and a speed of (0.5, 0.5)

        // Change the speed then move it again
        mp1.setSpeed(1.0f, 1.0f);
        mp1.move();
        System.out.println("After changing speed and moving, MovablePoint mp1: " + mp1); // It should be (2.5, 2.5), with a speed of (1.0, 1.0)
    }
}


