package ss11_stack_queue.Bai_Tap.Demerge;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String gender;
    private LocalDate dob;

    public Employee(String name, String gender, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                '}';
    }
}
