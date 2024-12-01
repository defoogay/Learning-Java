package Testing;

import Classes.Point;
import Classes.Square;

public class TestSquare {
    public static void main(String[] args) {
        Point yes = new Point(15,15);
        Point maybe = new Point(10, 10);
        Square no = new Square(maybe, 10);
        
        System.out.println(no.area());

        System.out.println(no.perimeter());
        
        System.out.println(no.isOn(yes));
        
        Point[] Corners = no.corners();
        for (int i = 0; i < 4; i++){
            System.out.println(Corners[i]);
        }
    }
}
