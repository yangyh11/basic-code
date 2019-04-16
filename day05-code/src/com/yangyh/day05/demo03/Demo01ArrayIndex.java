package com.yangyh.day05.demo03;

/**
 * @description: 数组索引越界异常
 * @author: yangyh
 * @create: 2019-04-16 21:28
 *
 * 数组的索引编号从0开始，一直到 "数组的长度-1" 为止
 *
 *如果访问数组元素的时候，索引编号并不存在，那么将会发生数组索引越界异常
 *
 * 原因：索引编号写错了
 * 解决：修改成为正确的的索引编号。
 **/
public class Demo01ArrayIndex {

    public static void main(String[] args) {
        int[] array = {10, 20, 30};

        System.out.println(array[0]); //10
        System.out.println(array[1]); //20
        System.out.println(array[2]); //30

        //错误写法
        //并不存在-1，3号元素，所以发生异常
        System.out.println(array[-1]);
        System.out.println(array[3]);
    }
}
