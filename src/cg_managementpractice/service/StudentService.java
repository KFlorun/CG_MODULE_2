package cg_managementpractice.service;

import cg_managementpractice.model.Student;
import cg_managementpractice.repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements IStudentService{
    StudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
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
