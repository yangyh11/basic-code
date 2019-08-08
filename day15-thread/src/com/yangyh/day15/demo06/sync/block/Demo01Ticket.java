package com.yangyh.day15.demo06.sync.block;

/**
 * @description: 解决线程安全问题_同步代码块
 * @author: yangyh
 * @create: 2019-07-27 20:57
 */
public class Demo01Ticket {
    public static void main(String[] args) {
        // 创建线程任务对象
        Runnable run = new RunnableImpl();

        // 创建3个售票窗口（线程）
        Thread thread1 = new Thread(run, "窗口1");
        Thread thread2 = new Thread(run, "窗口2");
        Thread thread3 = new Thread(run, "窗口3");

        // 3个窗口开始工作（售票）
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
