package com.yangyh.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * @description: 猜数字小游戏
 * @author: yangyh
 * @create: 2019-04-22 07:32
 *
 * 题目：用代码模拟猜数字的小游戏
 *
 * 思路：
 * 1.首先产生一个随机数字，并且一旦产生就不在发生变化。用Random的nextInt()方法。
 * 2.需要键盘输入，所以用到了Scanner类。
 * 3.获取键盘输入的数字，用Scanner的nextInt()方法。
 * 4.判断键盘输入的数字与产生的随机数字大小。
 *  4.1如果太大了，提示大了，游戏继续。
 *  4.2如果小了，提示小了，游戏继续。
 *  4.3如果相等，游戏结束。
 * 5.游戏继续就是再来一次，循环次数不确定，用while(true)
 **/
public class Demo04RandomGame {


    public static void main(String[] args) {
        //随机生成1~100的数字
        int num = new Random().nextInt(100) + 1;

        //游戏次数
        int count = 0;

        //游戏继续标志
//        boolean isContinue = true;

        System.out.println("游戏开始，请输入一位1~100的数字:");
        while (true) {

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            if (i > num) {
                System.out.println("大了,请继续");
            } else if (i < num) {
                System.out.println("小了，请继续");
            } else {
                System.out.println("猜中了！游戏结束");
                break; //猜中结束
//                isContinue = false;
            }

            count ++;
        }
        System.out.println("本局游戏共猜了" + count +"次");

    }
}
