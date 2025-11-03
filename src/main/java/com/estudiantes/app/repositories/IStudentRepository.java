package com.estudiantes.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.estudiantes.app.entitys.Student;

//ORM
public interface IStudentRepository extends CrudRepository<Student, Integer>{
	
}