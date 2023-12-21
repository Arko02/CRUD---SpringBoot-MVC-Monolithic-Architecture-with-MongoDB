package com.SpringBootMVC_Monolithic_MongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SpringBootMVC_Monolithic_MongoDb.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
