package mvc_model.student_manager.repository;

import mvc_model.student_manager.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void add(Student student);
    void deleteById(int id);
}
