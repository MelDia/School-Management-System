package com.Meldia.app.service;

import com.Meldia.app.entity.Teacher;
import com.Meldia.app.repo.TeacherRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author https://github.com/MelDia
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    public TeacherRepository teacherRepo;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepo.findAll();
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public Teacher getTeacherId(Long id) {
        return teacherRepo.findById(id).get();
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public void deleteTeacher(Long id) {
        teacherRepo.deleteById(id);
    }
    
    

}
