package com.yangyh.day05.demo02;

/**
 * @description: 一个数组的内存图
 * @author: yangyh
 * @create: 2019-04-16 21:22
 **/
public class Demo01ArrayOne {

    public static void main(String[] args) {

        //动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("------------");

        //
        array[1] = 20;
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
