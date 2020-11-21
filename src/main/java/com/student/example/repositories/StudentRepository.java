package com.student.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.example.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

	//Optional<Student> findByNameWithInitials(String nameWithInitials);
}
