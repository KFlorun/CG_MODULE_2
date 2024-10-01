package cg_managementpractice.controller;

import cg_managementpractice.model.Student;
import cg_managementpractice.service.StudentService;

import java.util.List;
import java.util.Scanner;


public class StudentController {
    StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    public void showStudentMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------");
            System.out.println("Choose your option");
            System.out.println("1. Display Student List\n" +
                    "2. Add Student\n" +
                    "3. Delete Student\n" +
                    "4. Exit");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 1:
                    System.out.println("--------LIST--------");
                    List<Student> studentList = studentService.getAll();
                    display(studentList);
                    break;
                case 2:
                    Student newStudent = inputDataStudent();
                    studentService.add(newStudent);
                    System.out.println("Add successfully");
                    break;
                case 3:
                    System.out.println("Enter id to delete");
                    int id = Integer.parseInt(sc.nextLine());
                    studentService.deleteById(id);
                    System.out.println("Delete successfully");
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    public void display(List<Student> studentList) {
        if (!studentList.isEmpty()) {
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(studentList.get(i));
            }
        } else {
            System.out.println("No students yet");
        }
    }
    public Student inputDataStudent() {
        System.out.println("Add Student");
        System.out.println("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        Student newStudent = new Student(name, id);
        return newStudent;
    }
}

