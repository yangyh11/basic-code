package com.yangyh.day05.demo01;

/**
 * @description: 访问数据元素进行获取
 * @author: yangyh
 * @create: 2019-04-16 17:12
 *
 * 直接打印数组名称，得到的是数组对应的：内存地址的哈希值
 *
 * 访问数组元素的格式：数组名称[索引值]
 * 索引值：就是一个int数字，代表数组当中元素的编号
 * 【注意】：索引值从0开始，直到 "数组长度-1" 结束
 *
 **/
public class Demo04ArrayUse {

    public static void main(String[] args) {

        //静态初始化省略格式
        int[] array = {10, 20, 30};

        System.out.println(array); //[I@4554617c

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("-------------");

        int a = array[1];
        System.out.println(a);
    }
}
