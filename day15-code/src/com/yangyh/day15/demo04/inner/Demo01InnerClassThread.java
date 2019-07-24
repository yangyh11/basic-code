package com.yangyh.day15.demo04.inner;

/**
 * @description: 匿名内部类方式实现线程的创建
 * @author: yangyh
 * @create: 2019-07-24 23:55
 * 匿名内部类方式实现线程的创建
 * 匿名：没有名字
 * 内部类：写在其他类内部的类
 *
 * 匿名内部类作用：简化代码
 *      1.把子类继承父类，重写父类的方法，创建子类对象合成一步完场。
 *      2.把实现类实现接口，重写接口中的方法，创建实现类对象合成一步完场。
 * 匿名内部类的最终产物：子类/实现类对象，而这个类没有名字（匿名）
 *
 * 格式：
 *      new 父类/实现类() {
 *          重写父类/接口中的方法
 *      };
 */
public class Demo01InnerClassThread {
    public static void main(String[] args) {

        // 线程的父类时Thread
        new MyThread().start();

        // 匿名内部类写法
        new Thread() {
            // 重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "父类方式（匿名内部类）--->" + i);
                }
            }
        }.start();

        // 线程的接口Runnable
        new Thread(new RunnableImpl()).start();

        // 匿名内部类写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "接口方式（匿名内部类）--->" + i);
                }
            }
        }).start();

    }
}
