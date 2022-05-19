package com.Meldia.app.service;

import com.Meldia.app.entity.Student;
import java.util.List;

/**
 *
 * @author https://github.com/MelDia
 */

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentId(Long id);

    Student updateStudent(Student student);

    void deleteStudent(Long id);
}
