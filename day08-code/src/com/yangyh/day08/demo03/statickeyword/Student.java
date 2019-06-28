package com.yangyh.day08.demo03.statickeyword;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-25 14:00
 **/
public class Student {

    private int id; //学号，自增长
    private String name;
    private int age;
    static String room;
    private static int idCount = 0; //学号计数器，每当new了一个新对象时，计数器++

    public Student() {
        this.id = ++idCount;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
