package cg_managementpractice.view;

import cg_managementpractice.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showStudentMenu();
    }
}
