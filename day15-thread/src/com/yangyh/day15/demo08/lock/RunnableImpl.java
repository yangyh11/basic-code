package com.yangyh.day15.demo08.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 实现卖票案例
 * @author: yangyh
 * @create: 2019-07-27 20:52
 * 解决线程安全问题的三种方案：使用lock锁
 * java.util.concurrent.locks.Lock接口
 * Lock实现提供了比synchronized代码块和方法更广泛的锁定操作。
 * Lock接口中的方法：
 * void lock() // 获取锁
 * void unlock()   // 释放锁
 * java.util.concurrent.locks.ReentrantLock implements Lock
 * <p>
 * 使用步骤：
 * 1.在成员位置创建一个ReentrantLock对象。
 * 2.在可能会出现安全问题的代码前调用Lock接口的lock方法获取锁。
 * 3.在可能会出现安全问题的代码后调用Lock接口的unlock方法释放锁。
 */
public class RunnableImpl implements Runnable {

    // 定义一个多线程共享的票源
    private static int ticket = 100;

    // 1.在成员位置创建一个ReentrantLock对象。
    Lock lock = new ReentrantLock();

    /**
     * 设置线程任务
     */
    @Override
    public void run() {
        System.out.println("this：" + this);
        // 使用死循环，让卖票操作重复执行
        while (true) {
            // 2.在可能会出现安全问题的代码前调用Lock接口的lock方法获取锁。
            lock.lock();

            // 先判断是否还是余票
            if (ticket > 0) {
                // 还有余票，卖票
                // 使用sleep模拟一下出票时间,提高线程安全问题出现的概率
                try {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket-- + "票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 3.在可能会出现安全问题的代码后调用Lock接口的unlock方法释放锁。
                    lock.unlock();
                }
            }
        }
    }

}
