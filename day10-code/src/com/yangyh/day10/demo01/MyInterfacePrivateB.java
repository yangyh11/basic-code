package com.yangyh.day10.demo01;

/**
 * @description: 接口的私有方法定义
 * @author: yangyh
 * @create: 2019-04-30 15:08
 **/
public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodCommon();

    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodCommon();
    }

//    public default void methodCommon() {
        // 改造为私有静态方法
    private static void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
