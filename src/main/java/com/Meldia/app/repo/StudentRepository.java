package com.Meldia.app.repo;

import com.Meldia.app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author https://github.com/MelDia
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
