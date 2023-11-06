package csci1011.jdotylab9;

/**
 * CSCI 1011 Lab 9
 * @author Jason Doty
 * This program tests constructors, gets number points, slope and distance.
 */
public class Point {
    private double x;
    private double y;
    private static int numPoints = 0;

    public Point() {
        initPoint(0.0, 0.0);
    }

    public Point(double x, double y) {
        initPoint(x, y);
    }

    private void initPoint(double x, double y) {
        this.x = x;
        this.y = y;
        numPoints++;
    }

    public static int getNumPoints() {
        return numPoints;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double getSlope(Point p1, Point p2) {
        if (p1.x == p2.x) {
            return Double.POSITIVE_INFINITY; // Vertical line
        } else {
            return (p2.y - p1.y) / (p2.x - p1.x);
        }
    }

    public static double getDistance(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

