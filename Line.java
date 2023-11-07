package csci1011.jdotylab10;

/**
 * CSCI 1011
 * @author Jason Doty
 * This program
 */
public class Line {
    private double slope;
    private double yIntercept;

    public Line() {
        set(1.0, 0.0); // Default constructor sets slope to 1 and y-intercept to 0
    }

    public Line(double slope, double yIntercept) {
        set(slope, yIntercept);
    }

    public void set(double slope, double yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public void set(Point p1, Point p2) {
        slope = Point.getSlope(p1, p2);
        double x = p1.getX();
        double y = p1.getY();
        yIntercept = y - slope * x;
    }

    public double getSlope() {
        return slope;
    }

    public double getYIntercept() {
        return yIntercept;
    }

    public static Point getIntersection(Line line1, Line line2) {
        if (line1.slope == line2.slope) {
            return new Point(Double.NaN, Double.NaN); // Parallel lines
        } else {
            double x = (line2.yIntercept - line1.yIntercept) / (line1.slope - line2.slope);
            double y = line1.slope * x + line1.yIntercept;
            return new Point(x, y);
        }
    }

    public static double getDistance(Point point, Line line) {
        double distance = Math.abs(line.slope * point.getX() - point.getY() + line.yIntercept) /
                         Math.sqrt(line.slope * line.slope + 1);
        return distance;
    }

    public String toString() {
        return "y = " + slope + "x + " + yIntercept;
    }
}
