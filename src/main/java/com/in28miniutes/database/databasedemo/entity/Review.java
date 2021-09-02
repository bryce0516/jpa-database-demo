package com.in28miniutes.database.databasedemo.entity;

import javax.persistence.*;

@Entity
public class Review {

  @Id
  @GeneratedValue
  private Long id;
  private String rating;
  @Column(nullable = false)
  private String description;
  @ManyToOne
  private Course course;

  protected Review() {

  }

  public Review(String rating, String description) {
    this.rating = rating;
    this.description = description;
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getRating() {
    return rating;
  }
  public void setRating(String rating) {
    this.rating = rating;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }
  @Override
  public String toString() {
    return String.format("Review[%s]", description, rating);
  }


}
