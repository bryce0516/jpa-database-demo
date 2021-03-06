package com.in28miniutes.database.databasedemo.entity;

import javax.persistence.*;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="EmployeeType")
@MappedSuperclass
public abstract class Employee {
  protected Employee() {}
  public Employee(String name){
    this.name = name;
  }

  @Id
  @GeneratedValue
  private Long id;
  @Column(nullable = false)
  private String name;


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

  @Override
  public String toString() {
    return String.format("Employee[%s]", name);
  }
}
