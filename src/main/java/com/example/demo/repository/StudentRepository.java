package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.project.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
