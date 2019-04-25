package com.yangyh.day08.demo03;

/**
 * @description: 静态static的内存图
 * @author: yangyh
 * @create: 2019-04-25 16:04
 **/
public class Demo03StaticStudent {

    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西，直接通过类名称来调用
        Student.room = "101教室";

        Student one = new Student("郭靖", 20);
        System.out.println("姓名：" + one.getName());
        System.out.println("年龄" + one.getAge());
        System.out.println("教室：" + Student.room);

        System.out.println("==========================");

        Student two = new Student("黄蓉", 15);
        System.out.println("姓名：" + two.getName());
        System.out.println("年龄" + two.getAge());
        System.out.println("教室：" + Student.room);
    }
}
