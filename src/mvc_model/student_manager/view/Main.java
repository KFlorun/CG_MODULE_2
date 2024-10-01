package mvc_model.student_manager.view;

import mvc_model.student_manager.controller.StudentController;
import mvc_model.student_manager.model.Student;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showStudentMenu();
    }
}
