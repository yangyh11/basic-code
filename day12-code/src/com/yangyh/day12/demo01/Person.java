package com.yangyh.day12.demo01;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-12 15:28
 **/
public class Person {

    private String name;

    private int age;


    public Person() {
    }

    public Person(String name, int age) {
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
