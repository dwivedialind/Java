package Introduction;

import java.awt.*;

public class MemoryPrimitiveVSReference {
    public static void main(String[] args) {
        byte x = 1, y = x; x = 2;
        System.out.println(y);

        Point p1 = new Point(1,2);
        Point p2 = p1;
        p1.x = 2; p1.y = 3;
        System.out.println(p2.x+" "+p2.y);
    }
}
