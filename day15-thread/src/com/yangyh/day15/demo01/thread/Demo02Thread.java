package com.yangyh.day15.demo01.thread;

/**
 * @description: 创建多线程程序的第一种方式_创建Thread类的子类
 * @author: yangyh
 * @create: 2019-07-16 23:18
 * 创建多线程程序的第一种方式：创建Thread类的子类
 * java.lang.Thread:是描述线程的类，我们想要实现多线程程序，就必须继承Thread类。
 * 实现步骤：
 *      1.创建一个Thread类的子类。
 *      2.在Thread类的子类中重写Thread类的run方法，设置线程的任务（开启线程要做什么？）
 *      3.创建Thread类的子类对象。
 *      4.调用Thread类的start方法，开启新的线程，执行run方法。
 *          public void start()     // 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
 *          结果是两个线程并发的执行；当前线程（main线程）和另一个线程（创建的新线程，执行其run方法）。
 *          多次启动一个线程是非法的。特别是当线程已经执行结束后，不能在重新启动。
 * Java程序属于抢占式调度,那个线程的优先级高，那个线程优先执行；同一个优先级，随机选择一个执行。
 */
public class Demo02Thread {
    public static void main(String[] args) {
        /** 3.创建Thread类的子类对象**/
        MyThread mt = new MyThread();
        /** 4.调用Thread类中的方法start方法，开启新的线程，执行run方法**/
        mt.start();
        System.out.println("mt线程的优先级：" +mt.getPriority());
        System.out.println("main线程的优先级：" + Thread.currentThread().getPriority());
        // 主线程会继续执行主方法中的代码
        for (int i = 0; i < 50; i++) {
            System.out.println("main:" + i);
        }

    }
}
