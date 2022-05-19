package com.Meldia.app.service;

import com.Meldia.app.entity.Student;
import com.Meldia.app.repo.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author https://github.com/MelDia
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository stuRepo;

    @Override
    public List<Student> getAllStudents() {
        return stuRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return stuRepo.save(student);
    }

    @Override
    public Student getStudentId(Long id) {
        return stuRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return stuRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        stuRepo.deleteById(id);
    }

}
