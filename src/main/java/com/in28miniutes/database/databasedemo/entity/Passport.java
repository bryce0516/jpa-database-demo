package com.in28miniutes.database.databasedemo.entity;

import javax.persistence.*;

@Entity
public class Passport {

  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = false)
  private String number;


  @OneToOne(fetch=FetchType.LAZY, mappedBy = "passport")
  private Student student;

  protected Passport() {

  }

  public Passport(String number){
    this.number = number;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return String.format("Passport[%s]", number);
  }


}
