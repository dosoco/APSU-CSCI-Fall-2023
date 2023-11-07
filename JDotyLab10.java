package csci1011.jdotylab10;

/**
 * CSCI 1011
 * @author Jason Doty
 * This program 
 */
public class JDotyLab10 {

    public static void main(String[] args) {
        // Create Line objects and test methods
        Line line1 = new Line(0.0, 0.0);
        Line line2 = new Line(0.75, 4.0);
        Line line3 = new Line(0.0, 3.0);
        Line line4 = new Line(2.0, 1.0);
        Line line5 = new Line(2.0, -3.0);
        
        System.out.println("Testing the toString method:");
        testToString(line1);
        testToString(line2);
        testToString(line3);
        testToString(line4);
        testToString(line5);

        // Create Point objects and test set methods
        Point point1 = new Point(2.0, 5.0);
        Point point2 = new Point(5.0, 11.0);

        System.out.println("Testing the set method:");
        testSet(line1, 3.0, 5.0);
        testSet(line2, point1, point2);

        // Test getIntersection method
        Line line6 = new Line(4.0, -1.0);
        Line line7 = new Line(3.0, 2.0);
        Line line8 = new Line(6.0, 5.0);
        Line line9 = new Line(6.0, 3.0);
        Line line10 = new Line(1.0, 1.0);

        System.out.println("Testing the getIntersection method:");
        testGetIntersection(line6, line7);
        testGetIntersection(line8, line9);
        testGetIntersection(line10, line10);

        // Test getDistance method
        Point point3 = new Point(1.0, 0.0);
        Point point4 = new Point(0.0, 5.0);
        Point point5 = new Point(3.0, 5.0);

        System.out.println("Testing the getDistance method:");
        testGetDistance(point3, line10);
        testGetDistance(point4, line2);
        testGetDistance(point5, line4);
    }

    public static void testToString(Line line) {
        
        System.out.println("The line with slope " + line.getSlope() + " and y-intercept " +
                line.getYIntercept() + " is " + line.toString());
    }

    public static void testSet(Line line, double newSlope, double newYIntercept) {
        line.set(newSlope, newYIntercept);
        System.out.println("The line with slope " + line.getSlope() + " and y-intercept " +
                line.getYIntercept() + " is " + line.toString());
    }

    public static void testSet(Line line, Point point1, Point point2) {
        line.set(point1, point2);
        
        System.out.println("The line from (" + point1.getX() + ", " + point1.getY() +
                ") to (" + point2.getX() + ", " + point2.getY() + ") is " + line.toString());
    }

    public static void testGetIntersection(Line line1, Line line2) {
        Point intersection = Line.getIntersection(line1, line2);
        
        System.out.println(line1.toString() + " and " + line2.toString() +
                " intersect at (" + intersection.getX() + ", " + intersection.getY() + ")");
    }

    public static void testGetDistance(Point point, Line line) {
        double distance = Line.getDistance(point, line);
        
        System.out.println("The distance from (" + point.getX() + ", " + point.getY() +
                ") and " + line.toString() + " is " + distance);
    }
}
