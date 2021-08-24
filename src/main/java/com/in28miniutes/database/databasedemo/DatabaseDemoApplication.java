package com.in28miniutes.database.databasedemo;


import com.in28miniutes.database.databasedemo.entity.Person;
import com.in28miniutes.database.databasedemo.jdbc.PersonJbdcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJbdcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("delete id 10002 -> {}", dao.deleteById(10002));
		logger.info("insert id 10004 -> {}",
				dao.insert(
						new Person(
								10004,
								"Mario",
								"Berlin",
								new Date()
						)
				)
		);
		logger.info("update id 10003 -> {}",
				dao.update(
						new Person(
								10003,
								"Pieter2",
								"Utah",
								new Date()
						)
				)
		);
	}
}
