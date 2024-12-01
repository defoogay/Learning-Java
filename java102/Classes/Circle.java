package Classes;
public class Circle implements Shape {
	public final Point center;
	public final double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/** 
	* @return Whether point p is inside of the circle.
	*/
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	/** 
	* @return Whether point p part of/on the border of the circle.
	*/
	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}

	/** 
	* @param x How much to translate the circle by in the + x direction.
	* @param y How much to translate the circle by in the + y direction.
	* @return The circle that results from the translation.
	*/
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	/** 
	* @return The circle that results from scaling by k.
	*/
	public Circle scale(double k) {
		return new Circle(center, radius * k);
	}

    public static Circle fromPoints(Point p1, Point p2, Point p3) {
        Point mOne = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        Point mTwo = new Point((p2.x = p3.x) / 2, (p2.y + p3.y) / 2);

        double sOne = (p1.y - p2.y) / (p1.x - p2.x);
        double sTwo = (p2.y - p3.y) / (p2.x - p3.x);

        double psOne = -1 / ((p1.y - p2.y) / (p1.x - p2.x));
        double psTwo = -1 / ((p2.y - p3.y) / (p2.x - p3.x));

        double intersectionX = 0;
        double intersectionY = 0;

        if (sOne == 0) {
            intersectionX = mOne.x;
            intersectionY = psTwo * (intersectionX + mTwo.x) + mTwo.y;
        }
        else if (sTwo == 0) {
            intersectionX = mTwo.x;
            intersectionY = psOne * (intersectionX + mOne.x) + mOne.y;
        }
        else {
            intersectionX = ((psOne * mOne.x) - (psTwo * mTwo.x)) / (psOne - psTwo);
            intersectionY = psOne * (intersectionX - mOne.x) + mOne.y;
        }
        Point center = new Point(intersectionX, intersectionY);
        double radius = Point.distance(center, p2);

        return new Circle(center, radius);
    }

	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}
}