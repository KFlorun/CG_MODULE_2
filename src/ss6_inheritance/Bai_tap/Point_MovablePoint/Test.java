package ss6_inheritance.Bai_tap.Point_MovablePoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1,2,3,4);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);
    }
}
