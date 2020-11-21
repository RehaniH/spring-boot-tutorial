package com.student.example.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AcademicYearSemesterResponseDto {

	@JsonProperty(value="id")
	private Long id;
	
	@JsonProperty(value="academic_year")
	private Integer academicYear;
	
	@JsonProperty(value="academic_semester")
	private Integer academicSemester;
}
