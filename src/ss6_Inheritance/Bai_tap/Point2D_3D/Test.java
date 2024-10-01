package ss6_Inheritance.Bai_tap.Point2D_3D;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point3D p3D = new Point3D(1,2,3);
        p3D.setX(3);
        System.out.println(p3D.getX());
        System.out.println(Arrays.toString(p3D.getXYZ()));
        p3D.setXYZ(3,4,5);
        System.out.println(Arrays.toString(p3D.getXYZ()));
    }
}
