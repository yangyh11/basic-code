package com.yangyh.day09.demo13;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-29 16:15
 **/
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("呼呼呼...");
    }
}
