package com.yangyh.day06.demo04;

/**
 * @description: this关键字
 * @author: yangyh
 * @create: 2019-04-20 10:43
 **/
public class Demo01Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "王健林";

        person.sayHello("王思聪");
        System.out.println(person);
    }
}
