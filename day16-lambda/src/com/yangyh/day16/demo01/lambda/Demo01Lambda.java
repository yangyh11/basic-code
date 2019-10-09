package com.yangyh.day16.demo01.lambda;

/**
 * @description: 使用实现Runnable接口的方法实现多线程程序
 * @author: yangyh
 * @create: 2019-09-19 20:44
 *
 * Lambda表达式的标准格式：
 * 由三部分组成：
 *      1.一些参数
 *      2.一个箭头
 *      3.一段代码
 * 格式：
 *      (参数列表) -> {一些重写方法的代码};
 * 解释说明格式：
 *      ()：接口中抽象方法的参数列表，没有参数，就空着；有参数就写出参数，多个参数使用逗号分隔
 *      ->：传递的意思，把参数传给方法体{}
 *      {}：重写接口的抽象方法的方法体
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        Runnable runnable = new RunnableImpl();
        new Thread(runnable).start();

        // 简化代码，使用匿名内部类，实现多线程
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        };
        new Thread(runnable2).start();

        // 使用Lambda表达式，实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "新线程创建了");
        }).start();

    }
}
