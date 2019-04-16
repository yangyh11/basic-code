package com.yangyh.day04.demo04;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-16 14:24
 *基本数据类型：
 * byte short int long float double char boolean
 * 引用数据类型：
 * String
 *
 * 在调用输出语句时，println方法就是进行了多种数据类型的重载。
 **/
public class Demo04MethodOverloadPrint {

    public static void main(String[] args) {
        myPrint(10); //int
        myPrint("Hello"); //String

    }

    public static void myPrint(byte num) {
        System.out.println(num);
    }

    public static void myPrint(short num) {
        System.out.println(num);
    }

    public static void myPrint(int num) {
        System.out.println(num);
    }

    public static void myPrint(long num) {
        System.out.println(num);
    }

    public static void myPrint(float num) {
        System.out.println(num);
    }

    public static void myPrint(double num) {
        System.out.println(num);
    }

    public static void myPrint(char zifu) {
        System.out.println(zifu);
    }

    public static void myPrint(boolean b) {
        System.out.println(b);
    }

    public static void myPrint(String str) {
        System.out.println(str);
    }

}
