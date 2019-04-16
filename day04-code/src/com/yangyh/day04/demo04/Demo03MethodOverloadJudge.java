package com.yangyh.day04.demo04;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-16 14:14
 **/
public class Demo03MethodOverloadJudge {

    public static void open(){} //正确重载
    public static void open(int a){} //正确重载
//    static void open(int a,int b){} //代码错误
//    public static void open(int a, int b){} //代码错误
    public static void open(double a, int b){} //正确重载
//    public static void open(int a, double b){} //代码错误
//    public static void open(int i, double j){} //代码错误
    public static void OPEN(){} //代码正确，但不是重载，方法名称不同

}
