package ss5_Modifier_Static.Bai_Tap.Student;

public class Student {
    private String name = "John";
    private String classes = "CO2";
    Student() {
    }

    Student(String name, String classes) {
        this.name = name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setClasses(String newClasses) {
        this.classes = newClasses;
    }
    public String display() {
        return this.name + " at " + this.classes;
    }
}
