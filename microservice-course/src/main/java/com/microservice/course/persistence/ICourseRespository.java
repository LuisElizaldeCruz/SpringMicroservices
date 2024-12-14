package com.microservice.course.persistence;

import com.microservice.course.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRespository extends CrudRepository<Course, Long> {

}
