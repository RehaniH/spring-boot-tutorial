package com.student.example.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseResponseDto {

	@JsonProperty(value="id")
	private Long id;
	
	@JsonProperty(value="name")
	private String name;
	
	@JsonProperty(value="code")
	private String code;
	
	@JsonProperty(value="year_semester")
	private AcademicYearSemesterResponseDto academicYearSemesterResponseDto;
}
