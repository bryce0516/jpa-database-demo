package com.in28miniutes.database.databasedemo;


import com.in28miniutes.database.databasedemo.entity.*;
import com.in28miniutes.database.databasedemo.jdbc.PersonJbdcDao;
import com.in28miniutes.database.databasedemo.jpa.PersonJpaRepository;
import com.in28miniutes.database.databasedemo.repository.CourseRepository;
import com.in28miniutes.database.databasedemo.repository.EmployeeRepository;
import com.in28miniutes.database.databasedemo.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

 @SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	 PersonJpaRepository repository;

	@Autowired
  private StudentRepository studentRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("All users -> {}", repository.findById(10001));

//		logger.info("User id 10001 -> {}", dao.findById(10001));

//		logger.info("insert id 10004 -> {}",
//				repository.insert(
//						new Person(
//								10005,
//								"Yuny",
//								"Tokyo",
//								new Date()
//						)
//				)
//		);
//		logger.info("update id 10003 -> {}",
//				repository.update(
//						new Person(
//								10003,
//								"Pieter3",
//								"Daejeon",
//								new Date()
//						)
//				)
//		);
//		repository.deleteById(10001);
//
//		logger.info("All users -> {}", repository.findAll());
//
//		Course course = courseRepository.findById(10001L);
//
//		logger.info("Course 10001 -> {}", course);
//		courseRepository.deleteById(10001L);
//		courseRepository.save(new Course("JPA4"));
//		courseRepository.playWithEntityManager();
//
//		studentRepository.saveStudentWithPassport();
//    List<Review> reviews = new ArrayList<>();
//    reviews.add(new Review("5", "Good job"));
//    reviews.add(new Review("4", "Good job2"));
//
//    courseRepository.addHardcodedReviewsForCourse();
//    courseRepository.addReviewsForCourse(10003L, reviews);
//    studentRepository.insertHardcodedStudentAndCourse();
//    studentRepository.insertStudentAndCourse(new Student("Jerry"), new Course("Microservices in 100 Steps"));
    employeeRepository.insert(new PartTimeEmployee("Jill", new BigDecimal("50")));
    employeeRepository.insert(new FullTimeEmployee("Perry", new BigDecimal("10000")));
//
//    logger.info("All Employee -> {}", employeeRepository.retrieveAllEmployees());
    logger.info("All FullTimeEmployee -> {}", employeeRepository.retrieveAllFullTimeEmployees());
    logger.info("All PartTimeEmployee -> {}", employeeRepository.retrieveAllPartTimeEmployees());
	}
}
