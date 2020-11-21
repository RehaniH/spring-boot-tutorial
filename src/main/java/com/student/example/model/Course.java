package com.student.example.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic(optional = false)
	private String name;
	
	@Basic(optional = false)
	private String code;
	
	@OneToOne
	private AcademicYearSemester academicYearSemester;
}
