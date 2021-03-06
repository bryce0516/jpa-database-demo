package com.in28miniutes.database.databasedemo.repository;

import com.in28miniutes.database.databasedemo.entity.Employee;
import com.in28miniutes.database.databasedemo.entity.FullTimeEmployee;
import com.in28miniutes.database.databasedemo.entity.PartTimeEmployee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class EmployeeRepository {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  EntityManager em;

  public void insert(Employee employee) {
    em.persist(employee);
  }

//  public List<Employee> retrieveAllEmployees(){
//    return em.createQuery("select e from Employee e", Employee.class).getResultList();
//  }
  public List<PartTimeEmployee> retrieveAllPartTimeEmployees(){
    return em.createQuery("select e from PartTimeEmployee e", PartTimeEmployee.class).getResultList();
  }

  public List<FullTimeEmployee> retrieveAllFullTimeEmployees(){
    return em.createQuery("select e from FullTimeEmployee e", FullTimeEmployee.class).getResultList();
  }

}
