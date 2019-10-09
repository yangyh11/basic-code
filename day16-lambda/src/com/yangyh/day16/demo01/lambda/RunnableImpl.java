package com.yangyh.day16.demo01.lambda;

/**
 * @description: 创建Runnable接口的实现类，重写run方法，设置线程任务
 * @author: yangyh
 * @create: 2019-09-19 20:46
 */
public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新线程创建了");
    }
}
