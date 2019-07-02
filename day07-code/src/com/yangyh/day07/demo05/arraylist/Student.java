package com.yangyh.day07.demo05.arraylist;

/**
 * @description: 学生类
 * @author: yangyh
 * @create: 2019-04-23 14:32
 **/
public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}
