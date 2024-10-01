package mvc_model.student_manager.controller;

import mvc_model.student_manager.model.Student;
import mvc_model.student_manager.service.IStudentService;
import mvc_model.student_manager.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private IStudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    public void showStudentMenu() {
        while (true) {
            System.out.println("Choose option \n" +
                    "1. Display Student List \n" +
                    "2. Add Student \n" +
                    "3. Delete Student \n" +
                    "4. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("---------LIST---------");
                    List<Student> studentList = studentService.findAll();
                    display(studentList);
                    break;
                case 2:
                    Student newStudent = inputDataStudent();
                    studentService.add(newStudent);
                    System.out.println("Add Successfully");
                    break;
                case 3:
                    System.out.println("Enter id to delete: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    studentService.deleteById(deleteId);
                    System.out.println("Delete successfully");
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    public void display(List<Student> studentList){
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
    public Student inputDataStudent() {
        System.out.println("Add New");
        System.out.println("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        Student newStudent = new Student(id, name);
        return newStudent;
    }
}
