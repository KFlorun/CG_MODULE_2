package cg_management;

import java.time.LocalDate;

public class Student extends Person{
    private String className;
    private LocalDate birth;

    public Student(int ID, String name, String email, String className, LocalDate birth) {
        super(ID, name, email);
        this.className = className;
        this.birth = birth;
    }
}
