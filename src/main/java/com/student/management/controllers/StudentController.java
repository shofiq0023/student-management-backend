package com.student.management.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.model.StudentModel;
import com.student.management.services.StudentServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentServices service;
	
	@GetMapping("/get/all")
	public List<StudentModel> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/get/all/desc")
	public List<StudentModel> getAllDesc() {
		return service.getAllDesc();
	}
	
	@GetMapping("/get/all/name")
	public List<StudentModel> getAllName() {
		return service.getAllNameAsc();
	}
	
	@GetMapping("/get/all/name/desc")
	public List<StudentModel> getAllNameDesc() {
		return service.getAllNameDesc();
	}
	
	@GetMapping("/get/{id}")
	public Optional<StudentModel> get(@PathVariable("id") Long id) {
		return service.get(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody StudentModel model) {
		service.add(model);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody StudentModel model) {
		service.update(model);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
