package com.student.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_management")
public class StudentModel {
	@Id
	@Column(name = "student_id")
	private Long id;

	@Column(name = "student_name")
	private String name;

	@Column(name = "student_email")
	private String email;

	public StudentModel() {
		super();
	}

	public StudentModel(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public StudentModel(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
