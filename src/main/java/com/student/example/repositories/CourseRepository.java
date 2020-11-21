package com.student.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.example.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
