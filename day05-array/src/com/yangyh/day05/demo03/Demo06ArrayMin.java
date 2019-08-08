package com.yangyh.day05.demo03;

/**
 * @description: 求出数组中的最小值
 * @author: yangyh
 * @create: 2019-04-17 14:30
 **/
public class Demo06ArrayMin {

    public static void main(String[] args) {

        int[] array = {5,10,25,30,15,20,1000,50};

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("数组中的最小值是：" + min);
    }
}
