package com.in28miniutes.database.databasedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {

  protected Passport() {

  }

  public Passport(String number){
    this.number = number;
  }

  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = false)
  private String number;

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
