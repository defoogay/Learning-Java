package Testing;

import Classes.Point;
import Classes.RightTriangle;

public class TestRightTriangle {
    public static void main(String[] args) {
        Point yes = new Point(13,13);
        Point maybe = new Point(10, 10);
        RightTriangle triFour = new RightTriangle(maybe, 10.0, 10.0);

        System.out.println(triFour.isOn(yes));

        System.out.println(triFour.isInside(yes));

        RightTriangle newTri = new RightTriangle(maybe, 20.0, 20.0);
        System.out.println(RightTriangle.similar(triFour, newTri));
    }
}
