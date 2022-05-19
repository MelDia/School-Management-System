package com.Meldia.app.repo;

import com.Meldia.app.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author https://github.com/MelDia
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    
}
