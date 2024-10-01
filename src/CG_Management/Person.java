package CG_Management;

import java.time.LocalDate;

public abstract class Person {
    protected int ID;
    protected String name;
    protected String email;

    public Person(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

}
