package com.yangyh.day10.demo06;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-06 17:43
 **/
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");

    }

    public void watchHouse() {
        System.out.println("狗看家");
    }
}
