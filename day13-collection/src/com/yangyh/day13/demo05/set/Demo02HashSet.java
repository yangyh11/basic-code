package com.yangyh.day13.demo05.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: HashSet存储自定义类型的元素
 * @author: yangyh
 * @create: 2019-06-18 08:49
 *
 * HashSet存储自定义类型的元素
 * set集合保证元素唯一：
 *      存储的元素（String，Integer，...Student，Person...)，必须重写hashCode方法和equals方法。
 * 要求：
 *      同名同年龄的人，视为同一个人，只能存储一次
 */
public class Demo02HashSet {

    public static void main(String[] args) {
        // 创建HashSet集合存储Person
        Set<Person> set = new HashSet<>();
        Person p1 = new Person("Rose", 18);
        Person p2 = new Person("Rose", 19);
        Person p3 = new Person("Rose", 18);
        System.out.println(p1.hashCode()); // 1967205423    79150148
        System.out.println(p3.hashCode()); // 42121758      79150148

        System.out.println(p1 == p3); // false      false
        System.out.println(p1.equals(p3));// false  true

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
