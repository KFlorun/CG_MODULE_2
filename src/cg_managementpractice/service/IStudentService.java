package cg_managementpractice.service;

import cg_managementpractice.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentService {
    List<Student> getAll();
    void add(Student student);
    void deleteById(int id);
}
