package com.yangyh.day15.demo02.thread.method;

/**
 * @description: Thread类的常用方法_获取线程名称的方法
 * @author: yangyh
 * @create: 2019-07-22 23:13
 * 线程的名称：
 *  主线程：main
 *  新线程：Thread-0，Thread-1，Thread-2，Thread-3
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        Thread thread = new Demo01MyThread();
        thread.start();

        new Demo01MyThread().start();
        new Demo01MyThread().start();
        new Demo01MyThread().start();

        System.out.println(Thread.currentThread().getName());// main
    }
}
