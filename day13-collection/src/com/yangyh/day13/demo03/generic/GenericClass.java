package com.yangyh.day13.demo03.generic;

/**
 * @description: 自定义含有泛型的类
 * @author: yangyh
 * @create: 2019-06-02 14:22
 *
 * 定义一个含有泛型的类，模拟ArrayList集合。
 * 泛型是一个未知的数据类型，当我们不确定什么数据类型的时候，可以使用泛型
 * 泛型可以接受任意的数据类型（基本数据类型除外），可以使用Integer，String，Student...
 * 创建对象的时候确定泛型的数据类型。
 */
public class GenericClass<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
