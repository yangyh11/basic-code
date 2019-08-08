package com.yangyh.day15.demo09.wait;

/**
 * @description: 等待唤醒测试类
 * @author: yangyh
 * @create: 2019-08-01 01:00
 * 测试类：
 * 1.包含main方法，程序执行的入口，启动程序。
 * 2.创建包子对象。
 * 3.创建包子铺线程，开启，生产包子。
 * 4.创建吃货线程，开启，吃包子。
 */
public class Demo03BaoZiTest {
    public static void main(String[] args) {
        // 创建包子对象
        BaoZi zi = new BaoZi();
        // 创建包子铺线程，并开启，生产包子
        new BaoZiPu(zi).start();
        // 创建吃货线程，并开启，吃包子
        new ChiHuo(zi).start();
    }
}
