package com.yangyh.day15.demo02.thread.method;

/**
 * @description: 获取线程的名称
 * @author: yangyh
 * @create: 2019-07-22 23:11
 * 获取线程的名称：
 *      1.使用Thread类中的方法getName()
 *          public final String getName()   // 返回该线程的名称
 *      2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称。
 *          public static Thread currentThread()    // 返回对当前正在执行的线程对象的引用
 */
public class Demo01MyThread extends Thread {

    /** 在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么？）**/
    @Override
    public void run() {
        // String name = this.getName();
        // System.out.println(name);

        // Thread thread = Thread.currentThread();
        // System.out.println(thread); // Thread[Thread-1,5,main]
        // String name = thread.getName();
        // System.out.println(name);

        // 链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
