package com.scoobyproductions.v1.k8stutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.scoobyproductions.v1.k8stutorial.entity.Student;

@RepositoryRestResource(path = "students")
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
