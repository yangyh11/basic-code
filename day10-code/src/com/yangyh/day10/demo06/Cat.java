package com.yangyh.day10.demo06;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-06 17:20
 **/
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
