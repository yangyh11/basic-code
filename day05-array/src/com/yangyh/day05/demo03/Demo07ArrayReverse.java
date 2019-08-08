package com.yangyh.day05.demo03;

/**
 * @description: 数组元素反转
 * @author: yangyh
 * @create: 2019-04-17 14:37
 *
 * 数组元素反转
 * 原数组 {1,2,3,4}
 * 反转后 {4,3,2,1}
 * 要求不能使用新数组
 **/
public class Demo07ArrayReverse {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        //打印原数组
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();

        int len = array.length;
        int middle = len / 2;

        int temp;

        //反转方法一
        for (int i = 0; i < middle; i++) {
            temp = array[i];
            array[i] = array[len - 1 -i];
            array[len - 1 -i] = temp;
        }

        //打印反转后的数组
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();

        //反转方法二
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        //打印反转后的数组
        for (int i : array) {
            System.out.print(i);
        }


    }
}
