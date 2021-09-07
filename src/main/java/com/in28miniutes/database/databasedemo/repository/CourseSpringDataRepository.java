package com.in28miniutes.database.databasedemo.repository;

import com.in28miniutes.database.databasedemo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {
  List<Course> findByName(String name);
  List<Course> findByNameAndId(String name, Long id);
  List<Course> countByName(String name);
  List<Course> findByNameOrderByIdDesc(String name);
  List<Course> deleteByName(String name);

  @Query("Select c From Course c where name like '%100 Steps'")
  List<Course> courseWith100StepsInName();

  @Query(value="Select * From Course c where name like '%100 Steps'", nativeQuery = true)
  List<Course> courseWith100StepsInNameUsingNativeQuery();

  @Query(name="query_get_100_Step_courses", nativeQuery = true)
  List<Course> courseWith100StepsInNameUsingNamedQuery();
}
