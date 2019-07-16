package com.yangyh.day15.demo01.thread;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-07-16 23:18
 */
public class Demo01Thread {
    public static void main(String[] args) {
        // 3.创建Thread类的子类对象
        MyThread mt = new MyThread();
        // 4.调用Thread类中的方法start方法，开启新的线程，执行run方法
        mt.start();

        // 主线程会继续执行主方法中的代码
        for (int i = 0; i < 50; i++) {
            System.out.println("main:" + i);
        }

    }
}
