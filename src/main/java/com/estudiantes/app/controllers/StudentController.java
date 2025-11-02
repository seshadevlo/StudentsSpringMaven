package com.estudiantes.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.estudiantes.app.entitys.Student;

@Controller
public class StudentController {

	@GetMapping({"/students", "/"})
	public String getAllStudents() {
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student= new Student();
		model.addAttribute("student", student);
		return "create-student";
	}
	
	@PostMapping("/students")
	public String saveNewStudent(@ModelAttribute("student") Student student) {
			
		//falta dao
		return "redirect:/students";
	}
	
}
