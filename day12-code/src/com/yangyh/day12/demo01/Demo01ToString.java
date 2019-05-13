package com.yangyh.day12.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @description: Object类的toString方法
 * @author: yangyh
 * @create: 2019-05-12 15:23
 *
 * java.lang.Object
 * 类Object是类层次结构的根（父）类。
 * 每个类（包括自定义的类）都使用的Object作为超（父）类。
 * 所有对象（包括数组）都实现这个类的方法。
 *
 * public String toString(); // 返回该对象的字符串表示。
 **/
public class Demo01ToString {

    public static void main(String[] args) {
        // Person类继承了Object类，所以可以使用Object类中的toString方法
        Person person = new Person("张三", 18);
        String str = person.toString();
        System.out.println(str); // com.yangyh.day12.demo01.Person@75412c2f

        // 直接打印对象的名字，其实就是调用对象的toString方法
        System.out.println(person);

        System.out.println("Student重写了toString方法");

        Student stu = new Student("张三", 18);
        String str2 = stu.toString();
        System.out.println(str2);
        System.out.println(stu);

        // 看一个类是否重写了toString方法，直接打印这个类的对象即可，如果没有重写，那么打印的就是对象的地址值。
        Random r = new Random();
        System.out.println(r); // 没有重写

        Scanner sc = new Scanner(System.in);
        System.out.println(sc); // 有重写

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); // 有重写


    }
}
