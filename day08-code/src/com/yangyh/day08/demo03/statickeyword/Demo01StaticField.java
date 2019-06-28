package com.yangyh.day08.demo03.statickeyword;

/**
 * @description: 静态关键字修饰成员变量
 * @author: yangyh
 * @create: 2019-04-25 13:58
 *
 * 一旦一个成员变量使用了static关键字，那么这个对象就不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 **/
public class Demo01StaticField {

    public static void main(String[] args) {

        Student stu1 = new Student("郭靖", 19);
//        stu1.room = "3年纪2班";
        Student.room = "3年纪2班";
        System.out.println("姓名：" + stu1.getName() + " 年龄：" + stu1.getAge() + " 班级：" + Student.room + " 学号" + stu1.getId());

        Student stu2 = new Student("黄蓉", 15);
        System.out.println("姓名：" + stu2.getName() + " 年龄：" + stu2.getAge() + " 班级：" + Student.room + " 学号" + stu2.getId());

        Student stu3 = new Student();
        stu3.setName("杨康");
        stu3.setAge(20);
        System.out.println("姓名：" + stu3.getName() + " 年龄：" + stu3.getAge() + " 班级：" + Student.room + " 学号" + stu3.getId());


    }
}
