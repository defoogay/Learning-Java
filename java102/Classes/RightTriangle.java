package Classes;
public class RightTriangle implements Shape {
    public final Point corner;
    public final double side1;
    public final double side2;
    public final double side3;

    public RightTriangle(Point corner, Double side1, Double side2) {
        this.corner = corner;
        this.side1 = side1;
        this.side2 =  side2;
        this.side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public RightTriangle scale(double x) {
        return new RightTriangle(corner, side1 * x, side2 * x);
    }

    public boolean isInside(Point p) {
        double triOne = 0;
        double triTwo = 0;
        double triThree = 0;
        if ((corner.x < p.x && p.x < corner.x + side2) && (corner.y < p.y && p.y < corner.y + side1)) {
            Point C = new Point(corner.x, corner.y + side1);
            Point A = new Point(corner.x, corner.y);
            Point B = new Point(corner.x + side2, corner.y);
            double sideCP = Point.distance(C, p);
            double sideAP = Point.distance(A, p);
            double sideBP = Point.distance(B, p);
            double sOne = (sideAP + sideCP + side1) / 2;
            double sTwo = (sideAP + sideBP + side2) / 2;
            triOne = Math.sqrt(sOne * (sOne - sideAP) * (sOne - sideCP) * (sOne - side1));
            triTwo = Math.sqrt(sTwo * (sTwo - sideAP) * (sTwo - sideBP) * (sTwo - side2));
            triThree = side1 * side2 / 2;
        }
        if (triOne + triTwo < triThree) {
                return true;
        }
        else {
            return false;
        }
    }
    public boolean isOn(Point p) {
        boolean truthvalue = false;
        Point one = new Point(corner.x, corner.y);
        Point two = new Point(corner.x + side2, corner.y);
        Point three = new Point(corner.x, corner.y + side1);

        double slope = (three.y - two.y) / (three.x - two.x);
        double yint = three.y - slope * three.x;

        if ((one.x == three.x && one.x == p.x) || 
            (one.x == two.x && one.x == p.x) ||
            (p.y == slope * p.x + yint)) {
                return truthvalue = true;
        }
        return truthvalue;
    }
    
    public double area() {
        return side1 * side2 / 2;
    }
    
    public double perimeter() {
        return side1 + side2 + side3;
    }

    public RightTriangle translate(double x, double y) {
        return new RightTriangle(new Point(corner.x + x, corner.y + y), side1, side2);
    }

    public static boolean similar(RightTriangle a, RightTriangle b) {
        double ratioOne = a.side1 / b.side2;
        double ratioTwo = a.side1 / b.side2;
        return ratioOne == ratioTwo;
    }
}
