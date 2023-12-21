package com.SpringBootMVC_Monolithic_MongoDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBootMVC_Monolithic_MongoDb.dto.StudentDto;
import com.SpringBootMVC_Monolithic_MongoDb.entity.Student;
import com.SpringBootMVC_Monolithic_MongoDb.service.StudentService;
import com.SpringBootMVC_Monolithic_MongoDb.utill.EmailService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@Autowired
	private EmailService emailService;

	@ModelAttribute
	public void addCommonAttributes(Model model) {
		model.addAttribute("Message", "SpringBoot MVC :- MongoDB - Monolithic Architecture");
	}

	@RequestMapping("/Manu") // http://localhost:8080/Manu
	public String menuPage() {
		return "MenuPage";
	}

	@RequestMapping("/Reggistration")
	public String registrationData() {
		return "RegistrationPage";
	}

	@RequestMapping("/SaveData")
	public String saveStudent(@ModelAttribute Student student, Model model) {
		this.service.saveData(student);
		this.emailService.sendEmail(student.getEmail(), "Thanks For Registration",
				"We are really appreciate it. You are considering our spring boot, monolithic Mongo DB app for registration.");

		model.addAttribute("Student", student);
		return "RegistrationPage";
	}

	@RequestMapping("/All")
	public String getAllData(Model model) {
		List<Student> allData = this.service.getAllData();
		model.addAttribute("AllStudents", allData);
		return "AllRegistrationPage";
	}

	@RequestMapping("/Delete")
	public String deleteData(@RequestParam("id") String id, Model model) {
		this.service.deleteStudentById(id);

		List<Student> allData = this.service.getAllData();
		model.addAttribute("AllStudents", allData);
		return "AllRegistrationPage";
	}

	@RequestMapping("/FindDataById")
	public String findData(@RequestParam("id") String id, Model model) {
		Student studentById = this.service.findStudentById(id);
		model.addAttribute("Student", studentById);
		return "UpdatePage";
	}

	@RequestMapping("/UpdateDetails")
	public String updateData(@ModelAttribute StudentDto dto, Model model) {

		Student student = new Student();
		student.setId(dto.getId());
		student.setName(dto.getName());
		student.setEmail(dto.getEmail());
		student.setMobile(dto.getMobile());
		student.setPassword(dto.getPassword());

		this.service.saveData(student);

		List<Student> allData = this.service.getAllData();
		model.addAttribute("AllStudents", allData);
		return "AllRegistrationPage";
	}

}
