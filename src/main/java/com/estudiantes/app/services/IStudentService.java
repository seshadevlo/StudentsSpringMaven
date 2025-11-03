package com.estudiantes.app.services;

import java.util.List;
import java.util.Optional;

import com.estudiantes.app.entitys.Student;

public interface IStudentService {

	public List<Student> listAllStudents();
	public Student saveStudent(Student student);
	//optional para manejar el null
	public Optional<Student> getStudentById(int id);
	public Student updateStudent(Student student);
	public void deleteStudentById(int id);
	
}
