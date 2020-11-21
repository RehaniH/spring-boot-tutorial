package com.student.example.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

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
}
