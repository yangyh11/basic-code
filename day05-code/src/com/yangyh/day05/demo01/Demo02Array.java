package com.yangyh.day05.demo01;

/**
 * @description: 数组初始化格式
 * @author: yangyh
 * @create: 2019-04-16 16:38
 *
 * 动态初始化（指定长度）：在创建数组的时候，指定数组的长度。
 * 静态初始化（指定内容）：在创建数组的时候，不直接指定数组的长度，而是将具体内容进行指定。
 *
 * 静态初始化基本格式：
 * 数据类型[] 数组名称 = new 数据类型[]{数据1，数据2， ...};
 *
 * 注意事项：
 * 虽然静态初始化没有直接告诉长度，但是根据大括号里面的具体指定内容，也可以自动推算出来长度。
 **/
public class Demo02Array {

    public static void main(String[] args) {

        //创建一个数组，里面装的全是int数字，具体为 1,5,10
        int[] arrayA = new int[]{1, 5, 10};

        //创建一个数组，里面装的全是String字符串，具体为 "Hello","World","Java"
        String[] arrayB = new String[]{"Hello", "World", "Java"};
    }
}
