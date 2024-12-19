package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8080/api/student")//cual es el microservicio al que vamos a consultar
public interface StudentClient {

    @GetMapping("/search-my-course/{idCourse}")//para acceder al endpoint de la peticion en donde se comunica con el curso
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse);
}
