package com.yangyh.day15.demo09.wait;

/**
 * @description: 吃货类
 * @author: yangyh
 * @create: 2019-08-01 00:41
 * 消费者（吃货）类：是一个线程，可以继承Thread
 * 设置线程任务（run）：吃包子
 * 对包子的状态进行判断
 * false：没有包子
 * 吃货调用wait方法进入等待状态
 * true：有包子
 * 吃货吃包子
 * 吃货吃完包子
 * 修改了包子的状态为false没有
 * 吃货唤醒包子铺线程，生产包子
 */
public class ChiHuo extends Thread {
    // 1.需要在成员位置构建一个包子变量。
    private BaoZi zi;

    // 2.使用参数构造方法，为这个包子变量赋值。
    public ChiHuo(BaoZi zi) {
        this.zi = zi;
    }

    @Override
    public void run() {
        // 使用死循环，让吃货一直吃包子
        while (true) {
            synchronized (zi) {
                // 对包子的状态进行判断
                if (zi.isFlag() == false) { // 没有包子
                    // 吃货调用wait方法进入等待状态
                    try {
                        zi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 被唤醒之后执行，吃货吃包子
                System.out.println("吃货正在吃：" + zi.getPi() + zi.getXian() + "包子");

                // 吃包子需要1秒钟
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 吃货吃完了包子
                // 修改包子的状态为false没有
                zi.setFlag(false);
                // 唤醒包子铺线程，让包子铺线程成产包子
                zi.notify();
                System.out.println("吃货已经吃完了：" + zi.getPi() + zi.getXian() + "包子,包子铺可以开始生产包子了"); // 没有包子
                System.out.println("------------------------------------------------------------");
            }
        }
    }
}
