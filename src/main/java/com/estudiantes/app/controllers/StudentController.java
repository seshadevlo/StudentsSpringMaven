package com.estudiantes.app.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.estudiantes.app.entitys.Student;
import com.estudiantes.app.services.IStudentService;

@Controller
public class StudentController {
//variable del tipo de la interfaz
	private final IStudentService service;
	
	@Autowired
	public StudentController(IStudentService service) {
		this.service = service;
	}
	
	
	@GetMapping({"/students", "/"})
	public String getAllStudents(Model model) {
		model.addAttribute("students", service.listAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student= new Student();
		model.addAttribute("student", student);
		return "create-student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
			service.saveStudent(student);
		return "redirect:/students";
	}
	
}
