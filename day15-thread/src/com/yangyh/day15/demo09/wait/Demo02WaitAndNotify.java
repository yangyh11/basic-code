package com.yangyh.day15.demo09.wait;

/**
 * @description: Object类中wait带参数和notifyAll方法
 * @author: yangyh
 * @create: 2019-07-31 22:40
 * 进入到TimeWaiting（计时等待）有两种方式
 *  1.使用Thread类的 sleep(long millis)方法，在毫秒值之后，线程睡醒进入到Runnable/Blocked状态。
 *  2.使用Object类的 wait(long timeout)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程进入到Runnable/Blocked状态。
 *
 *  唤醒的方法：
 *      1.public final void notify()    // 唤醒在此对象监视器上等待的单个线程
 *      2.public final void notifyAll() // 唤醒在此对象监视器上等待的所有线程
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        // 创建所对象，保证唯一
        Object obj = new Object();

        // 创建一个顾客线程（消费者）
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    // 保证等待和唤醒的线程只能有一个在执行，需要使用到同步技术
                    synchronized (obj) {
                        System.out.println("顾客1：告知老板要的包子的种类和数量");

                        // 调用wait方法，放弃cpu的执行，进入到WAITING(无限等待）
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("顾客1：包子已经做好了，开吃！");
                        System.out.println("-----------------------");
                    }
                }
            }
        }).start();

        // 创建一个顾客线程（消费者）
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    // 保证等待和唤醒的线程只能有一个在执行，需要使用到同步技术
                    synchronized (obj) {
                        System.out.println("顾客2：告知老板要的包子的种类和数量");

                        // 调用wait方法，放弃cpu的执行，进入到WAITING(无限等待）
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("顾客2：包子已经做好了，开吃！");
                        System.out.println("-----------------------");
                    }
                }
            }
        }).start();

        // 创建一个老板线程（生产者）
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    // 花了5秒钟做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 保证等待和唤醒的线程只能有一个在执行，需要使用到同步技术
                    synchronized (obj) {
                        System.out.println("老板：花费数秒钟之后做好包子，告知顾客，可以吃包子了");
                        // 做好包子后，调用notify方法，唤醒顾客吃包子
//                        obj.notify();// 如果有多个等待线程，随机唤醒一个
                        obj.notifyAll();// 唤醒所有等待的线程
                    }
                }
            }
        }).start();
    }
}
