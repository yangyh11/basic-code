package com.yangyh.day13.demo03.generic;


/**
 * @description: 使用自定义含有泛型的类
 * @author: yangyh
 * @create: 2019-06-02 13:52
 */
public class Demo02GenericClass {

    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<>();

        genericClass.setName("Rose");
        System.out.println(genericClass.getName());
    }

}
