package com.yangyh.day15.demo07.sync.method;

/**
 * @description: 实现卖票案例
 * @author: yangyh
 * @create: 2019-07-27 20:52
 * 解决线程安全问题的二种方案：使用同步方法
 * 格式：
 * public synchronized void method() {
 * 可能会出现线程安全问题的代码（访问了共享数据的代码）
 * }
 */
public class RunnableImpl implements Runnable {

    // 定义一个多线程共享的票源
    private static int ticket = 100;

    /**
     * 设置线程任务
     */
    @Override
    public void run() {
        System.out.println("this：" + this);
        // 使用死循环，让卖票操作重复执行
        while (true) {
            payTicketStatic02();
        }
    }

    /**
     * 定义一个同步方法
     * 同步方法也会把方法内部的代码锁住，只会让一个线程执行
     * 同步方法的锁对象是谁？
     * 就是实现类对象，new RunnableImpl()
     * 也就是this
     */
    public synchronized void payTicket01() {
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

    /**
     * 验证同步方法的锁对象就是this
     */
    public void payTicket02() {
        synchronized (this) {
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

    /**
     * 静态的同步方法
     * 锁对象是谁？
     * 不能是this
     * this是创建对象之后产生的，静态方法优先于对象
     * 静态方法的锁对象是本类的class属性--->class文件对象（反射）
     */
    public static synchronized void payTicketStatic01() {
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

    /**
     * 验证静态同步方法的锁对象不是this，而是class文件对象（反射）
     */
    public static void payTicketStatic02() {
//        synchronized (this) {
        synchronized (RunnableImpl.class) {
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
