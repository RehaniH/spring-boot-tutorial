package com.student.example.service;

import java.util.List;

import com.student.example.request.AcademicYearSemesterRequest;
import com.student.example.response.AcademicYearSemesterResponseDto;

public interface AcademicYearSemesterService {
	
	AcademicYearSemesterResponseDto addAcademicYearSemester(AcademicYearSemesterRequest request);
	AcademicYearSemesterResponseDto updateAcademicYearSemester(AcademicYearSemesterRequest request);
	AcademicYearSemesterResponseDto removeAcademicYearSemester(AcademicYearSemesterRequest request);
	List<AcademicYearSemesterResponseDto> getAllAcademicYearSemester(AcademicYearSemesterRequest request);
	AcademicYearSemesterResponseDto getlAcademicYearSemesterById(Long id) throws Exception;
}
