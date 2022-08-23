package com.spring.boot.springbootmybatis.mapper;

import com.spring.boot.springbootmybatis.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:StudentMapper
 * Package:com.spring.boot.springbootmybatis.mapper
 * Description:
 *
 * @Date:2022/6/30 16:19
 * @Author:gaomingfa
 */
@Mapper //加注解可以被spring boot扫描到 可以使用动态代理了
       // 或者不加这个注解而是在启动类加上 @MapperScan("com.spring.boot.springbootmybatis.mapper") 是一样的
public interface StudentMapper {
    List<Student> selectAllStudent();
}
