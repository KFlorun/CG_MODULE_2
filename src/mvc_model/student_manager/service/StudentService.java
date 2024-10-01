package mvc_model.student_manager.service;

import mvc_model.student_manager.model.Student;
import mvc_model.student_manager.repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements IStudentService{
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
