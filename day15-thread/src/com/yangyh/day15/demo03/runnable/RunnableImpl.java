package com.yangyh.day15.demo03.runnable;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-07-24 23:38
 */
// 1.创建一个Runnable接口的实现类。
public class RunnableImpl implements Runnable {

    // 2.在实现类中重写Runnable接口的run方法，设置线程任务。
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
