package com.yangyh.day15.demo01.thread;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-07-27 16:30
 */
public class Person {
    private String name;

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + i);
        }
    }
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
