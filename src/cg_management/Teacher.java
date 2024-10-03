package cg_management;

public class Teacher extends Person{
    private String position;
    private int salary;

    public Teacher(int ID, String name, String email, String position, int salary) {
        super(ID, name, email);
        this.position = position;
        this.salary = salary;
    }
}
