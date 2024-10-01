package mvc_model.student_manager.service;

import mvc_model.student_manager.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void add(Student student);
    void deleteById(int id);
}
