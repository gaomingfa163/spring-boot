package com.spring.boot.springbootmybatis.controller;

import com.spring.boot.springbootmybatis.bean.Student;
import com.spring.boot.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:StudentController
 * Package:com.spring.boot.springbootmybatis.controller
 * Description:
 *
 * @Date:2022/6/30 16:26
 * @Author:gaomingfa
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> selectAllStudent(){
        return studentService.selectAllStudent();
    }
}
