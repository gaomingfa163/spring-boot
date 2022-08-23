package com.spring.boot.springbootmybatis.bean;

/**
 * ClassName:Student
 * Package:com.spring.boot.springbootmybatis.bean
 * Description:
 *
 * @Date:2022/6/30 16:06
 * @Author:gaomingfa
 */
public class Student {

    private String name;

    private int age;

    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
