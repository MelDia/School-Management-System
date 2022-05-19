package com.Meldia.app.controller;

import com.Meldia.app.entity.Student;
import com.Meldia.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author https://github.com/MelDia
 */
@Controller
public class StudentControl {

    @Autowired(required = true)
    private StudentService stuServ;


    @GetMapping("/index")
    public String listStudents(Model model) {
        model.addAttribute("students", stuServ.getAllStudents());
        return "index";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        Student stu = new Student();
        model.addAttribute("student", stu);
        return "create_student";
    }
    
    @PostMapping("/students/add")
    public String saveStudent(@ModelAttribute("student") Student student) {
        stuServ.saveStudent(student);
        return "redirect:/index";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", stuServ.getStudentId(id));
        return "edit_student";
    }
    
    @PostMapping("/students/{id}")
    public String updateStudentForm(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
        Student existing = stuServ.getStudentId(id);
        existing.setId(id);
        existing.setName(student.getName());
        existing.setLastName(student.getLastName());
        existing.setEmail(student.getEmail());

        stuServ.updateStudent(existing);
        return "redirect:/index";
    }

    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        stuServ.deleteStudent(id);
        return "redirect:/index";
    }
    
}
