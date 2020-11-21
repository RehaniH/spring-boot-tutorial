package com.student.example.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseRequest {

	@JsonProperty(value = "code")
	private String code;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "year_semester")
	private AcademicYearSemesterRequest academicYearSemesterRequest;
	@JsonProperty(value = "course_id")
	private Long id;
}
