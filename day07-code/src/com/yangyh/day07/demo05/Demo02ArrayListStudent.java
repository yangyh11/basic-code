package com.yangyh.day07.demo05;

import java.util.ArrayList;

/**
 * @description: ArrayList集合存储自定义对象
 * @author: yangyh
 * @create: 2019-04-23 14:29
 *
 * 题目：自定义四个对象，添加到集合，并遍历。
 *
 * 思路：
 * 1.自定义Student对象。
 * 2.创建一个ArrayList集合，用来存储学生对象。泛型<Student>
 * 3.根据类，创建4个对象。
 * 4.将4个对象添加到集合中。
 * 5.遍历集合。
 **/
public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        //创建ArrayList集合用来存储Student对象。
        ArrayList<Student> list = new ArrayList<>();

        //创建4个学生对象
        Student stuA = new Student("张三", 18);
        Student stuB = new Student("李四", 18);
        Student stuC = new Student("王五", 18);
        Student stuD = new Student("赵六", 18);

        list.add(stuA);
        list.add(stuB);
        list.add(stuC);
        list.add(stuD);
        System.out.println(list);

        for (Student student : list) {
            System.out.println("姓名：" + student.getName());
        }

    }
}
