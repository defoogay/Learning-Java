package Classes;
public class Square implements Shape {
	public final Point corner;
	public final double sideLength;

	/**
	* @param corner The bottom left corner of the square
	* @param sideLength
	*/
	public Square(Point corner, double sideLength) {
		this.corner = corner;
		this.sideLength = sideLength;
	}

	public double area() {
		return Math.pow(sideLength, 2);
	}
	
	public double perimeter() {
		return 4 * sideLength;
	}
	
	/** 
	* @return Whether point p is inside of the square.
	*/
	public boolean isInside(Point p) {
		double xDist = p.x - corner.x;
		double yDist = p.y - corner.y;
		return 0 < xDist && xDist < sideLength &&
			   0 < yDist && yDist < sideLength;
	}

	/** 
	* @return Whether point p part of/on the border of the square.
	*/
	public boolean isOn(Point p) {
        double xDist = p.x - corner.x;
		double yDist = p.y - corner.y;
		if (0 < xDist && xDist < sideLength &&
			0 < yDist && yDist < sideLength) {
                return 0 == 1;
            }
            else {
                return p.x <= corner.x + sideLength && p.y <= corner.y + sideLength;
            }
	}
	
	/** 
	* @param x How much to translate the sqaure by in the + x direction.
	* @param y How much to translate the squarer by in the + y direction.
	* @return The sqaure that results from the translation.
	*/
	public Square translate(double x, double y) {
		return new Square(corner.translateX(x).translateY(y), sideLength);
	}

	/** 
	* @return The sqaure that results from scaling the side length and maintaining the bottom left corner
	*/
	public Square scale(double k) {
		return new Square(corner, sideLength * k);
	}

	public Point[] corners() {
        Point[] arrC = new Point[4];
        Point corner1 = new Point(corner.x, corner.y + sideLength);
        Point corner2 = new Point(corner.x + sideLength, corner.y + sideLength);
        Point corner3 = new Point(corner.x, corner.y);
        Point corner4 = new Point(corner.x + sideLength, corner.y);
        arrC[0] = corner1;
        arrC[1] = corner2;
        arrC[2] = corner3;
        arrC[3] = corner4;
        return arrC;
	}
	
    @Override
	public String toString() {
		return "(corner: " + corner + "; side length: " + sideLength + ")";
	}
}