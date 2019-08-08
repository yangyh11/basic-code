package com.yangyh.day15.demo09.wait;

/**
 * @description: 等待唤醒案列代码实现
 * @author: yangyh
 * @create: 2019-07-30 21:39
 * 等待唤醒案例：线程之间的通信
 * 1.创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，放弃cpu的执行，进入到WAITING(无限等待）。
 * 2.创建一个老板线程（生产者）：花了5秒钟做包子，做好包子之后，调用notify方法，唤醒顾客吃包子。
 * 注意：
 * 1.顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行。
 * 2.同步使用的所对象必须保证唯一。
 * 3.只有锁对象才能掉调用wait和notify方法。
 * java.lang.Object类中的方法：
 * public final void wait()    // 在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
 * public final void notify()  // 唤醒在此对象监视器上等待的单个线程，会继续执行wait之后的代码。
 */
public class Demo01WaitAndNotify {
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
                        System.out.println("顾客：告知老板要的包子的种类和数量");

                        // 调用wait方法，放弃cpu的执行，进入到WAITING(无限等待）
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("顾客：包子已经做好了，开吃！");
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
                        obj.notify();
                    }
                }
            }
        }).start();
    }
}
