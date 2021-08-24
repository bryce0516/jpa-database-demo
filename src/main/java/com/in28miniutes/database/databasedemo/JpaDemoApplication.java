package com.in28miniutes.database.databasedemo;


import com.in28miniutes.database.databasedemo.entity.Person;
import com.in28miniutes.database.databasedemo.jdbc.PersonJbdcDao;
import com.in28miniutes.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

 @SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	 PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("All users -> {}", repository.findById(10001));

//
//		logger.info("User id 10001 -> {}", dao.findById(10001));

		logger.info("insert id 10004 -> {}",
				repository.insert(
						new Person(
								10005,
								"Yuny",
								"Tokyo",
								new Date()
						)
				)
		);
		logger.info("update id 10003 -> {}",
				repository.update(
						new Person(
								10003,
								"Pieter3",
								"Daejeon",
								new Date()
						)
				)
		);
		repository.deleteById(10001);
	}
}
