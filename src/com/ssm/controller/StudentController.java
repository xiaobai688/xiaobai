package com.ssm.controller;

import com.ssm.entry.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("queryStudentByStuno")
    public String queryStudentByStuno(@RequestParam("stuno") Integer stuno){
        Student student = studentService.queryStudentByStuno(stuno);
        System.out.println(student);
        return "result";
    }
}
