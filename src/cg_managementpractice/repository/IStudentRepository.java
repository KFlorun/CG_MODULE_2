package cg_managementpractice.repository;

import cg_managementpractice.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    void add(Student student);
    void deleteById(int id);
}
