package com.yangyh.day10.demo06;

/**
 * @description: 用instanceof关键字进行类型判断
 * @author: yangyh
 * @create: 2019-05-06 17:55
 **/
public class Demo01Instanceof {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.eat();

        // 希望调用子类特有的方法，需要向下转型
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        // 判断一下animal本来是不是Cat
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(animal);

    }

    public static void giveMeAPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
