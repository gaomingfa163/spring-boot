package com.spring.boot.springbootmybatis.service;

import com.spring.boot.springbootmybatis.bean.Student;
import com.spring.boot.springbootmybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName:StudentServiceImpl
 * Package:com.spring.boot.springbootmybatis.service
 * Description:
 *
 * @Date:2022/6/30 16:23
 * @Author:gaomingfa
 */
@Service
@Transactional //开启事务，和启动类上的@EnableTransactionManagement注解一起使用
public class StudentServiceImpl implements StudentService {

    //把studentMapper注入进来
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }
}
