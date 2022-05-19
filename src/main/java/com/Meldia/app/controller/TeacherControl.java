package com.Meldia.app.controller;

import com.Meldia.app.entity.Teacher;
import com.Meldia.app.service.TeacherService;
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
public class TeacherControl {

    @Autowired(required = true)
    private TeacherService teacherServ;


    @GetMapping("/teachers")
    public String listTeachers(Model model) {
        model.addAttribute("teachers", teacherServ.getAllTeachers());
        return "teachers";
    }

    @GetMapping("/teachers/new")
    public String createTeacherForm(Model model) {
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "create_teacher";
    }
    
    @PostMapping("/teachers/add")
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
        teacherServ.saveTeacher(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/edit/{id}")
    public String editTeacherForm(@PathVariable Long id, Model model) {
        model.addAttribute("teacher", teacherServ.getTeacherId(id));
        return "edit_teacher";
    }
    
    @PostMapping("/teachers/{id}")
    public String updateTeacherForm(@PathVariable Long id, @ModelAttribute("teacher") Teacher teacher, Model model) {
        Teacher existing = teacherServ.getTeacherId(id);
        existing.setId(id);
        existing.setName(teacher.getName());
        existing.setLastName(teacher.getLastName());
        existing.setContact(teacher.getContact());
        existing.setSignature(teacher.getSignature());
        existing.setStatus(teacher.getStatus());

        teacherServ.updateTeacher(existing);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/delete/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherServ.deleteTeacher(id);
        return "redirect:/teachers";
    }
    
}
