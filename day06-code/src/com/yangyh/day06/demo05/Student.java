package com.yangyh.day06.demo05;

/**
 * @description: 定义一个标准的类
 * @author: yangyh
 * @create: 2019-04-20 11:07
 *
 * 一个标准的类通常要拥有下面四个部分：
 *
 * 1.所有的成员变量都要使用private关键字修饰。
 * 2.为每一个成员变量提供一对Getter/Setter方法。
 * 3.编写一个无参数构造方法。
 * 4.编写一个全参数构造方法。
 *
 * 这样的标准类叫做Java Bean
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
