package com.yangyh.day15.demo09.wait;

/**
 * @description: 包子铺线程
 * @author: yangyh
 * @create: 2019-07-31 23:47
 * 生产者（包子铺）类：是一个线程类，可以继承Thread
 * 设置线程任务（run）：生产包子
 * 对包子的状态进行判断
 * true:有包子
 * 包子铺调用wait方法进入等待状态
 * false：没有包子
 * 包子铺生产包子
 * 增加一些趣味性：交替生产两种包子
 * 有两种状态（i%2 == 0)
 * 包子铺生产好了包子
 * 修改包子的状态为true值
 * 唤醒吃货线程，让吃货线程吃包子
 * <p>
 * 注意：
 * 包子铺线程和包子线程关系-->通信（互斥）
 * 必须使用同步技术保证两个线程只能有一个在执行
 * 锁对象必须保证唯一，可以使用包子对象作为锁对象
 * 包子铺类和吃货的类就需要把包子对象作为参数传递进来
 * 1.需要在成员位置构建一个包子变量。
 * 2.使用参数构造方法，为这个包子变量赋值。
 */
public class BaoZiPu extends Thread {
    // 1.需要在成员位置构建一个包子变量。
    private BaoZi zi;

    // 2.使用参数构造方法，为这个包子变量赋值。
    public BaoZiPu(BaoZi zi) {
        this.zi = zi;
    }

    // 设置线程任务（run）：生产包子
    @Override
    public void run() {
        // 定义一个变量
        int count = 0;
        // 让包子铺一直生产包子
        while (true) {
            // 必须使用同步技术保证两个线程只能有一个在执行
            synchronized (zi) {
                // 对包子的状态进行判断
                if (zi.isFlag()) { // 有包子
                    // 包子铺调用wait方法进入等待状态
                    try {
                        zi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 被唤醒之后执行，包子铺生产包子
                // 增加一些趣味性：交替生产两种包子
                if (count % 2 == 0) {
                    // 生产 薄皮三鲜馅包子
                    zi.setPi("薄皮");
                    zi.setXian("三鲜");
                } else {
                    // 生产 冰皮牛肉馅包子
                    zi.setPi("冰皮");
                    zi.setXian("牛肉");
                }
                count++;
                System.out.println("包子铺正在生产：" + zi.getPi() + zi.getXian() + "包子");
                // 生产包子需要3秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 包子铺生产好了包子
                // 修改包子的状态为true有
                zi.setFlag(true);
                // 唤醒吃货线程，让吃货线程吃包子
                zi.notify();
                System.out.println("包子铺生产好了：" + zi.getPi() + zi.getXian() + "包子,吃货可以开始吃了");

            }
        }

    }
}
