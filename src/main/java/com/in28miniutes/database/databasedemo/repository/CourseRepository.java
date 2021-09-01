package com.in28miniutes.database.databasedemo.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class CourseRepository {
    @Autowired
    EntityManager em;

    
}
