package com.yangyh.day10.demo01;

/**
 * @description: 接口的静态方法的使用
 * @author: yangyh
 * @create: 2019-04-30 14:07
 *
 * 从Java8开始，接口中允许定义静态方法。
 * 格式：
 * public static 返回值类型 方法名称(参数列表) {
 *     方法体
 * }
 * 提示：就是将abstract或者default关键字换成static，加上方法体即可
 **/
public interface MyInterfaceStatic {

    public static void methodStatic() {
        System.out.println("这是接口的静态方法");
    }
}
