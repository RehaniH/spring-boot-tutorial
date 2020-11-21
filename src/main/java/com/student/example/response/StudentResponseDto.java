package com.student.example.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class StudentResponseDto {

	@JsonProperty(value = "id")
	private Long id;
	
	@JsonProperty(value = "firstname")
	private String firstName;
	
	@JsonProperty(value = "lastname")
	private String lastName;
	
	@JsonProperty(value = "name_with_initials")
	private String nameWithInitials;
	
	@JsonProperty(value = "student_id")
	private String studentId;
	
	@JsonProperty(value = "date_of_birth")
	private Date dateOfBirth;
	
	@JsonProperty(value = "course_list")
	private CourseResponseDto courseResponseDto;

	
}
