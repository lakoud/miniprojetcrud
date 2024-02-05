package com.rania.miniprojectcrud.restapi.repository;

import com.rania.miniprojectcrud.restapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
