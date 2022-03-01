package com.student.management.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.model.StudentModel;
import com.student.management.repository.StudentRepository;

@Service
public class StudentServices {
	@Autowired
	private StudentRepository repo;
	
	public List<StudentModel> getAll() {
		List<StudentModel> students = new ArrayList<>();
		repo.findAllByOrderByIdAsc().forEach(students::add);
		return students;
	}
	
	public List<StudentModel> getAllDesc() {
		List<StudentModel> students = new ArrayList<>();
		repo.findAllByOrderByIdDesc().forEach(students::add);
		return students;
	}
	
	public List<StudentModel> getAllNameAsc() {
		List<StudentModel> students = new ArrayList<>();
		repo.findAllByOrderByNameAsc().forEach(students::add);
		return students;
	}
	
	public List<StudentModel> getAllNameDesc() {
		List<StudentModel> students = new ArrayList<>();
		repo.findAllByOrderByNameDesc().forEach(students::add);
		return students;
	}
	
	public Optional<StudentModel> get(Long id) {
		return repo.findById(id);
	}
	
	
	public void add(StudentModel model) {
		repo.save(model);
	}
	
	public void update(StudentModel model) {
		repo.save(model);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
