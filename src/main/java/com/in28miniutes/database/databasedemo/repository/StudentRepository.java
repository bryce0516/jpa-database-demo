package com.in28miniutes.database.databasedemo.repository;

import com.in28miniutes.database.databasedemo.entity.Passport;
import com.in28miniutes.database.databasedemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class StudentRepository {

  @Autowired
  EntityManager em;

  public Student findById(Long id) { return em.find(Student.class, id);}

  public Student save(Student student) {
    if(student.getId()==null){
      em.persist(student);
    } else {
      em.merge(student);
    }
    return student;
  }

  public void deleteById(Long id){
    Student student = findById(id);
    em.remove(student);
  }

  public void saveStudentWithPassport(){
    Passport passport = new Passport("Z123456");
    em.persist(passport);

    Student student = new Student("Mike");
    student.setPassport(passport);
    em.persist(student);
  }

  public void someOperationToUnderstandPersistenceContext(){
    Student student = em.find(Student.class, 20001L);

    Passport passport = student.getPassport();

    passport.setNumber("E123456");

    student.setName("Ranga -updated");
  }
}
