package com.student.example.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcademicYearSemesterRequest {

	@JsonProperty(value="academic_year")
	private Integer academicYear;
	
	@JsonProperty(value="academic_semester")
	private Integer academicSemester;
}
