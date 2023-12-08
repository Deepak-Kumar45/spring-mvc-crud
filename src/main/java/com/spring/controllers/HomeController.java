package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Student;
import com.spring.entity.StudentDTO;
import com.spring.repo.StudentRepo;
import com.spring.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/show-list")
	public String getStudents(Model model) {
		System.out.println("!!..get all students..!!");
		List<Student> list=service.getAllStudents();
		System.out.println(list);
		model.addAttribute("list", list);
		return "show-list";
	}
	
	@GetMapping("/show-form")
	public String showStudentAddform() {
		return "addstudent-form";
	}
	
	@GetMapping("/show-form-update")
	public String showAddformForUpdate(@RequestParam("id") int id,Model model) {
		System.out.println("Data has been fecthed for student with id "+id);
		Student std=service.getStudent(id);
		model.addAttribute("std", std);
		return "addstudent-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute StudentDTO stdDto) {
		System.out.println(stdDto);
		service.addStudent(stdDto);
		return "redirect:/show-list";
	}
	
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute StudentDTO stdDto) {
		System.out.println(stdDto);
		service.updateStudent(stdDto);
		return "redirect:/show-list";
	}
	
	@GetMapping("/deleteStd")
	public String deleteStudent(@RequestParam("id") int id) {
		service.deleteStudent(id);
		return "redirect:/show-list";
	}
	
	@GetMapping("/thankyou")
	@ResponseBody
	public String thankYou() {
		return "Thank you so much for adding your details..";
	}
}
