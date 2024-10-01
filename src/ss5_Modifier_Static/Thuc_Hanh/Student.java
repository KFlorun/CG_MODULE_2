package ss5_Modifier_Static.Thuc_Hanh;

public class Student {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
    private int rollno;
    private String name;
    private static String college = "RMIT";
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "CG";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
