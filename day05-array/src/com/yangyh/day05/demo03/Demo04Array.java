package com.yangyh.day05.demo03;

/**
 * @description: 数组遍历
 * @author: yangyh
 * @create: 2019-04-17 14:11
 *
 * 遍历数组：就是对数组元素进行逐一、挨个儿处理。默认的处理方式就是打印输出。
 *
 **/
public class Demo04Array {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        //原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);

        System.out.println("------------------");

        //采用循环的方式
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("------------------");

        //采用foreach（增强for循环）循环方式
        for (int i : array) {
            System.out.println(i);
        }

    }
}
