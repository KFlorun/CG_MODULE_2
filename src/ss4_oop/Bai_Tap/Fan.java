package ss4_oop.Bai_Tap;

import java.util.Scanner;

public class Fan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter info for obj_1: ");
        int speed1 = sc.nextInt();
        double radius1 = sc.nextDouble();
        String color1 = sc.next();
        boolean on1 = sc.nextBoolean();
        System.out.println("Enter info for obj_2: ");
        int speed2 = sc.nextInt();
        double radius2 = sc.nextDouble();
        String color2 = sc.next();
        boolean on2 = sc.nextBoolean();
        Fan fan1 = new Fan(speed1, on1, radius1, color1);
        Fan fan2 = new Fan(speed2, on2, radius2, color2);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
    private static final int Slow = 1;
    private static final int Medium = 2;
    private static final int Fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        this.speed = Slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public String toString() {
        if (this.on) {
            return "speed: " + this.speed + " radius: " + this.radius +
                    " color: " + this.color + " status: on";
        } else {
            return "speed: " + this.speed + " radius: " + this.radius +
                    " color: " + this.color + " status: off";
        }
    }
}
