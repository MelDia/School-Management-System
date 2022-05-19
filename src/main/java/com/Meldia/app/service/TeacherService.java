package com.Meldia.app.service;

import com.Meldia.app.entity.Teacher;
import java.util.List;

/**
 *
 * @author https://github.com/MelDia
 */

public interface TeacherService {

    List<Teacher> getAllTeachers();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacherId(Long id);

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacher(Long id);
}
