package csci1011.jdotylab9;

/**
 * CSCI 1011 Lab 9
 * @author Jason Doty
 * This program tests constructors, gets number points, slope and distance.
 */
public class JDotyLab9 {
    public static void main(String[] args) {
        testConstructors();
        testGetNumPoints();
        testGetSlope();
        testGetDistance();
    }

    private static void testConstructors() {
        System.out.println("Testing default constructor");
        Point point1 = new Point();
        System.out.println("The point is " + point1.toString());

        System.out.println("Testing two-argument constructor");
        Point point2 = new Point(3.5, 8.1);
        System.out.println("The point is " + point2.toString());
    }
    
    private static void testGetNumPoints() {
        System.out.println("Testing getNumPoints method");
        System.out.println("The number of points created is " + Point.getNumPoints());
    }

    private static void testGetSlope() {
        System.out.println("Testing getSlope method");
        Point p1 = new Point(2.0, 1.0);
        Point p2 = new Point(4.0, 2.0);
        double slope = Point.getSlope(p1, p2);
        System.out.println("The slope of the line from " + p1.toString() + " to " + p2.toString() + " is " + slope);
    }

    private static void testGetDistance() {
        System.out.println("Testing getDistance method");
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(3.0, 4.0);
        double distance = Point.getDistance(p1, p2);
        System.out.println("The distance from " + p1.toString() + " to " + p2.toString() + " is " + distance);
    }
}

