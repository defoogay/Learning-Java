package Testing;

import Classes.Circle;
import Classes.Point;

public class TestCircle {
    public static void main(String[] args) {
        Circle newCircle = Circle.fromPoints(new Point(2, 2), new Point(4, 4), new Point(3, 5));

        System.out.println("center: " + newCircle.center);
        System.out.println("radius: " + newCircle.radius);
    }
}
