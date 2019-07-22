package com.yangyh.day15.demo02.thread.method;


/**
 * @description: Thread类的常用方法_设置线程名称的方法
 * @author: yangyh
 * @create: 2019-07-22 23:32
 */
public class Demo02SetThreadName {
    public static void main(String[] args) {
        Thread thread = new Demo02MyThread();
        // 使用setName(名称)设置线程名称
        thread.setName("小强");
        thread.start();

        System.out.println(new Demo02MyThread("旺财").getName());
    }
}
