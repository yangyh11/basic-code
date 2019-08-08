package com.yangyh.day11.demo01final;

/**
 * @description: final关键字用于修饰成员变量
 * @author: yangyh
 * @create: 2019-05-07 17:39
 *
 * 对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可变的。
 *
 * 1.由于成员变量具有默认值，所以用了final后必须手动赋值，不会再给默认值。
 * 2.对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。二者选其一。
 * 3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值。
 **/
public class Person {

//    private final String name = "";
    private final String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
