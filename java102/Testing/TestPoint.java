package Testing;

import Classes.Point;

public class TestPoint {
    public static void main(String[] args) {
        // Points
        Point point = new Point(4, 3);
        Point coin = new Point(8, 6);
        Point yuh = new Point(12, 9);
        Point[] arrA = {point, coin, yuh};
        
        System.out.println("x: " + point.x + " " + "y: " + point.y);
        
        // x/y translation
        Point xTranslation = point.translateX(3); 
        Point yTranslation = point.translateY(-7); 
        Point xyTranslation = point.translateX(-4).translateY(-3);
        
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);
        
        // Distance
        System.out.println(Point.distance(point, coin));
        
        // Center of mass
        Point centerOfMass = Point.centerOfMass(arrA);
        System.out.println(centerOfMass);
        
        // Angle
        System.out.println(point.angle());
    }
}