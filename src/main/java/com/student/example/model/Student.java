package com.student.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	private String studentId;
	
	@Basic(optional = false)
	private String firstName;
	
	private String lastName;
	
	private String nameWithInitials;
	
	@Column(name = "dob")
	private Date dateOfBirth;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Course> courses;
	
}
