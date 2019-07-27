package com.yangyh.day12.demo01.object;

import java.util.Objects;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-12 23:48
 *
 * Objects类的equals方法：对两个对象进行比较，防止空指针异常
 * public static boolean equals(Object a, Object b) {
 *      return (a == b) || (a != null && a.equals(b));
 * }
 **/
public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = null;
        String s3 = "abc";
        System.out.println(s1.equals(s2));

        // NullPointerException,null不是不能调用方法的，
        System.out.println(s2.equals(s3));
        // Objects类的equals方法：对两个对象进行比较，防止空指针异常
        System.out.println(Objects.equals(s2, s3));
    }
}
