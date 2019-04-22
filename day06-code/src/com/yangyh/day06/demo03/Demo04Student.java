package com.yangyh.day06.demo03;

/**
 * @description: private关键字练习
 * @author: yangyh
 * @create: 2019-04-20 10:27
 **/
public class Demo04Student {

    public static void main(String[] args) {

        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名是：" + stu.getName());
        System.out.println("年龄是：" + stu.getAge());
        System.out.println("是不是爷们：" + stu.isMale());

    }
}
