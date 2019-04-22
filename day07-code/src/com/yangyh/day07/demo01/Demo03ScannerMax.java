package com.yangyh.day07.demo01;

import java.util.Scanner;

/**
 * @description: 键盘输入三个数字，求最大值
 * @author: yangyh
 * @create: 2019-04-20 18:34
 *
 * 思路：
 * 1.既然书键盘输入，肯定就需要用到Scanner。
 * 2.Scanner类用法三步骤：导包，创建，使用nextInt()方法。
 * 3.既然是三个数字，那么调用三次nextInt()方法，得到三个int值。
 * 4.既然无法同时判断三个数字谁最大，就转换成为两个步骤
 *  4.1首先判断前两个当中谁最大，拿到前两个中的较大值。
 *  4.2拿着前两个中的最大值，再和第三个值比较，得到三个数字当中的最大值。
 **/
public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数值：");
        int a = sc.nextInt();

        System.out.println("请输入第二个数值：");
        int b = sc.nextInt();

        System.out.println("请输入第三个数值：");
        int c = sc.nextInt();

        int temp = a > b ? a:b;
        int max = temp > c ? temp:c;

        System.out.println("三个数中的最大值是：" + max);
    }
}
