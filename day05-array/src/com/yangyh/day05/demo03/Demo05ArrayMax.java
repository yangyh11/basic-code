package com.yangyh.day05.demo03;

/**
 * @description: 求出数组中的最大值
 * @author: yangyh
 * @create: 2019-04-17 14:30
 **/
public class Demo05ArrayMax {

    public static void main(String[] args) {

        int[] array = {5,10,25,30,15,20,1000,50};

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("数组中的最大值是：" + max);
    }
}
