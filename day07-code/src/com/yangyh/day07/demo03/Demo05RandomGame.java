package com.yangyh.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * @description: 抢红包游戏
 * @author: yangyh
 * @create: 2019-04-22 07:56
 *
 * 题目：指定红包总金额、红包个数，随机分发
 *
 * 思路：
 * 1.确定每个人抢红包的兜底金额是多少。
 * 2.当一个人抢红包时，在红包 n=剩余红包金额-(人数-1)*兜底金额 的范围内产生随机数，即该人所抢到的红包金额。
 * 3.下一个人抢，执行第二步，循环次数为红包份个数-1。
 * 4.当最后一个人抢时，红包剩余金额全是他的。
 **/
public class Demo05RandomGame {

    public static void main(String[] args) {
        //红包兜底金额
        int minNum = 1;
        //抢到的红包金额
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红包总金额:");
        int sum = sc.nextInt();
        System.out.println("请输入红包个数");
        int number = sc.nextInt();

        Random r = new Random();
        for (int i = 0; i < number-1; i++) {
            n = r.nextInt(sum-(number - i - 1)*minNum) + 1; //随机拆分
            System.out.println("本次抢到的红包金额是：" + n);
            sum = sum - n;
        }

        n = sum; //最后一人，红包剩余金额全是他的
        System.out.println("本次抢到的红包金额是：" + n);
    }
}
