package com.yangyh.day15.demo10.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: 线程池的代码实现
 * @author: yangyh
 * @create: 2019-08-01 23:28
 * 线程池：JDK1.5之后提供的
 * java.util.concurrent.Executors:线程池的工厂类，用来生产线程池
 * Executors类中的静态方法：
 *      public static ExecutorService newFixedThreadPool(int nThreads)   // 创建一个可重用固定线程的线程池
 *      参数：
 *          int nThreads:创建线程池中包含的线程数量
 *      返回值：
 *          ExecutorService接口，返回的是ExecutorService接口的实现类对象-ThreadPoolExecutor，我们可以使用ExecutorService接口来接收（面向接口编程）
 * java.util.concurrent.ExecutorService：线程池接口
 *      1. submit(Runnable task)    // 提交一个 Runnable 任务用于执行
 *         用来从线程池中获取线程，调用start方法，执行线程任务
 *      2.void shutdown()   // 启动一次顺序关闭，执行以前提交的任务，但不接受新任务
 *         关闭/销毁线程池
 * 线程池的使用步骤：
 *      1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池。
 *      2.创建一个类，实现Runnable接口，重写run方法，设置线程任务。
 *      3.调用ExecutorService接口中的submit方法，传递线程任务（实现类），开启线程，执行任务。
 *      4.调用ExecutorService接口中的shutdown销毁线程池（不建议执行）。
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        // 1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池。
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 3.调用ExecutorService接口中的submit方法，传递线程任务（实现类），开启线程，执行任务。
        Runnable task = new RunnableImpl();
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "创建了一个新的线程执行(lambda)"));

    }
}
