package com.yangyh.day07.demo01.scanner;

import java.util.Scanner;

/**
 * @description: 键盘出入两个数字求和
 * @author: yangyh
 * @create: 2019-04-20 18:00
 *
 * 题目：键盘输入两个数字，求出和值
 *
 * 思路：
 * 1.既然是键盘输入，那么就用Scanner。
 * 2.Scanner的三个步骤：导包、创建、使用。
 * 3.需要的是两个数字，所以需要调用两次nextInt()方法。
 * 4.得到了两个数字，就需要加在一起。
 * 5.将结果打印。
 **/
public class Demo02ScannerSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("两个数字的和为：" + sum);
    }
}
