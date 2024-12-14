package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.persistence.ICourseRespository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements ICourseService{

    @Autowired
    private ICourseRespository coursesRespository;

    @Override
    public List<Course> findAll() {
        return (List<Course>) coursesRespository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return coursesRespository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
    coursesRespository.save(course);
    }
}
