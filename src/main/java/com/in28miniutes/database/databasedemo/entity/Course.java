package com.in28miniutes.database.databasedemo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "course")
    private List<Review> reviews = new ArrayList<>();
    @ManyToMany(mappedBy = "courses")
    private List<Student> students = new ArrayList<>();
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
  public List<Review> getReviews() {
    return reviews;
  }

  public void addReview(Review review) {
    this.reviews.add(review);
  }

  public void removeReview(Review review) {
    this.reviews.remove(review);
  }


  public List<Student> getStudents() {
    return students;
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }


}
