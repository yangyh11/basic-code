package com.yangyh.day04.demo04;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-16 13:55
 *
 * 题目要求：
 * 比较两个数据是否相等。
 * 参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型
 * 并在main方法中测试
 **/
public class Demo02MethodOverloadSame {

    public static void main(String[] args) {
        byte a = 11;
        byte b = 12;
        System.out.println(isSame(a, b));
        System.out.println(isSame((short)12,(short)12));
        System.out.println(isSame(20,20));
        System.out.println(isSame(21L,20L));
    }

    public static boolean isSame(byte a,byte b){
        System.out.println("判断两个byte类型的参数是否相等");

        boolean same ;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b){
        System.out.println("判断两个short类型的参数是否相等");

        return a == b;
    }

    public static boolean isSame(int a,int b){
        System.out.println("判断两个int类型的参数是否相等");

        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(long a,long b){
        System.out.println("判断两个long类型的参数是否相等");

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }


}
