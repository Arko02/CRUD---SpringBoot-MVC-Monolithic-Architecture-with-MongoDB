package com.SpringBootMVC_Monolithic_MongoDb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootMVC_Monolithic_MongoDb.entity.Student;
import com.SpringBootMVC_Monolithic_MongoDb.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public void saveData(Student student) {
		this.repository.save(student);
	}

	public List<Student> getAllData() {
		List<Student> all = this.repository.findAll();
		return all;
	}

	public void deleteStudentById(String id) {
		this.repository.deleteById(id);
	}

	public Student findStudentById(String id) {
		Student student = this.repository.findById(id).get();
		return student;
	}

}
