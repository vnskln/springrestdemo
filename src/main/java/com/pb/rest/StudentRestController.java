package com.pb.rest;

import com.pb.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @RequestMapping("/students")
    public List<Student> getStudents() {
        List <Student> studentsList = new ArrayList();
        studentsList.add(new Student ("John", "Doe"));
        studentsList.add(new Student ("Albert", "Doe"));
        studentsList.add(new Student ("Mary", "Doe"));
        return studentsList;
    }
}
