package com.student.management.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.student.management.model.StudentModel;

public interface StudentRepository extends CrudRepository<StudentModel, Long> {
	List<StudentModel> findAllByOrderByIdAsc();
	
	List<StudentModel> findAllByOrderByIdDesc();
	
	List<StudentModel> findAllByOrderByNameAsc();
	
	List<StudentModel> findAllByOrderByNameDesc();
}
