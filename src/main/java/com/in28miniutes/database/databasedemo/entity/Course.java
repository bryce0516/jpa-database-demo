package com.in28miniutes.database.databasedemo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NamedQueries(
        value = {
                @NamedQuery(name="query_get_all_courses", query="Select c from Course c"),
                @NamedQuery(name="query_get_100_Step_courses", query="Select c from Course c where name like '%JPA'")
        }
)

public class Course {


    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
    @CreationTimestamp
    private LocalDateTime createdDate;

    protected Course() {}


    public Course(String name){
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
