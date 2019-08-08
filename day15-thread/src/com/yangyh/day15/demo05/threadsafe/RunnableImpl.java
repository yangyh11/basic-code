package com.yangyh.day15.demo05.threadsafe;

/**
 * @description: 实现卖票案例
 * @author: yangyh
 * @create: 2019-07-27 20:52
 */
public class RunnableImpl implements Runnable {

    // 定义一个多线程共享的票源
    private int ticket = 100;

    /**
     * 设置线程任务
     */
    @Override
    public void run() {

        // 使用死循环，让卖票操作重复执行
        while (true) {
            // 先判断是否还是余票
            if (ticket > 0) {
                // 还有余票，卖票
                // 使用sleep模拟一下出票时间,提高线程安全问题出现的概率
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket-- + "票");
            }
        }
    }

}
