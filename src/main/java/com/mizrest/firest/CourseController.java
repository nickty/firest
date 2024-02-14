package com.mizrest.firest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
            new Course(1, "Learn Spring Boot", "Some description"),
            new Course(2, "Learn Spring Boot 2", "Some description 2"),
            new Course(3, "Learn Spring Boot 2", "Some description 2"),
            new Course(4, "Learn Spring Boot 2", "Some description 2"),
            new Course(5, "Learn Spring Boot 2", "Some description 2"),
            new Course(6, "Learn Spring Boot 2", "Some description 2")
        );
    }
}
