package com.in28miniutes.database.databasedemo.jpa;

import com.in28miniutes.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
      public class PersonJpaRepository {

        @PersistenceContext
        EntityManager entityManager;

        public List<Person> findAll(){
          TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
          return namedQuery.getResultList();
        }

        public Person findById(int id) {
          return entityManager.find(Person.class, id);
        }

        public Person update(Person person){
          return entityManager.merge(person);
        }

        public Person insert(Person person){
          return entityManager.merge(person);
        }

        public void deleteById(int id){
          Person person = findById(id);
        entityManager.remove(person);
    }
}
