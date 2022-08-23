package com.spring.boot.springbootmybatis.service;

import com.spring.boot.springbootmybatis.bean.Student;

import java.util.List;

/**
 * ClassName:StudentService
 * Package:com.spring.boot.springbootmybatis.service
 * Description:
 *
 * @Date:2022/6/30 16:22
 * @Author:gaomingfa
 */
public interface StudentService {

    List<Student> selectAllStudent();
}
