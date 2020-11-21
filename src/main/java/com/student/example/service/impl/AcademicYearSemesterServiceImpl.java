package com.student.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.student.example.model.AcademicYearSemester;
import com.student.example.repositories.AcademicYearSemesterRepository;
import com.student.example.request.AcademicYearSemesterRequest;
import com.student.example.response.AcademicYearSemesterResponseDto;
import com.student.example.service.AcademicYearSemesterService;

@Service
public class AcademicYearSemesterServiceImpl implements AcademicYearSemesterService{
	
	private AcademicYearSemesterRepository academicYearSemesterRepository;

	@Override
	public AcademicYearSemesterResponseDto addAcademicYearSemester(AcademicYearSemesterRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicYearSemesterResponseDto updateAcademicYearSemester(AcademicYearSemesterRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicYearSemesterResponseDto removeAcademicYearSemester(AcademicYearSemesterRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AcademicYearSemesterResponseDto> getAllAcademicYearSemester(AcademicYearSemesterRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicYearSemesterResponseDto getlAcademicYearSemesterById(Long id) throws Exception {
		
		Optional<AcademicYearSemester> yearSemester = this.academicYearSemesterRepository.findById(id);
		
		if(!yearSemester.isPresent()) {
			throw new Exception();
		}
		return null;
	}

}
