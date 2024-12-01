package Classes;
public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point translateX(double t) {
        return new Point(x + t, y);
    }
    
    public Point translateY(double t) {
        return new Point(x, y + t);
    }
    
    @Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
    
    public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
    
    public static Point centerOfMass(Point[] points) {
        double xAvg = 0;
        double yAvg = 0;
        for(int i = 0; i < points.length; i++) {
            Point pointHolder = points[i];
            double xValue = pointHolder.x; double yValue = pointHolder.y;
            xAvg += xValue;
            yAvg += yValue;
        }
        return new Point(xAvg / points.length, yAvg / points.length);
    }
    
    public double angle() {
        double angleRadians = Math.atan2(y, x);
        double radiansAngle = Math.toDegrees(angleRadians);
        return radiansAngle;
    }
}
