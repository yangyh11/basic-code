package com.yangyh.day09.demo13;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-29 16:16
 **/
public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal();

//        Dog dog = new Dog();

        Dog2Ha ha = new Dog2Ha();
        ha.eat();
        ha.sleep();

        System.out.println("===============");

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}
