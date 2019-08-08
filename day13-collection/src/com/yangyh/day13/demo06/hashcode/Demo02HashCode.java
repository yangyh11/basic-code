package com.yangyh.day13.demo06.hashcode;

/**
 * @description: 哈希值
 * @author: yangyh
 * @create: 2019-06-17 22:18
 */
public class Demo02HashCode {
    public static void main(String[] args) {
        // Object类是所有类的父类，所以Person类的对象可以使用Object类的hashCode()方法
        Student stu1 = new Student();
        int code1 = stu1.hashCode();
        System.out.println(code1); // 1

        Student stu2 = new Student();
        int code2 = stu2.hashCode();
        System.out.println(code2); // 1

        // 虽然两个对象的哈希值相等，但物理地址并不相等
        System.out.println(stu1 == stu2); // false

        System.out.println("----------------------------");

        // String的哈希值
        // String重写了hashCode()方法
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }

}
