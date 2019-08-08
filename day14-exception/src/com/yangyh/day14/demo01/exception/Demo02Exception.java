package com.yangyh.day14.demo01.exception;

/**
 * @description: 异常的产生过程解析
 * @author: yangyh
 * @create: 2019-06-26 23:53
 */
public class Demo02Exception {
    /**
     * 第二步：
     * main方法调用getElement方法接收到了这个异常对象，main方法也没有异常的处理逻辑（try-catch），
     * 继续把异常对象抛出给main方法的调用者JVM处理。
     */
    public static void main(String[] args) {
        // 创建int类型的数组，并赋值
        int[] arr = {1, 2, 3};
        int i = getElement(arr, 3);
        System.out.println(i);
    }

    /**
     * 定义一个方法，获取数组指定索引处的元素
     *
     * 第一步：
     * 访问了数组中的3索引，而数组是没有3索引的，这时候，JVM就会检测出程序会出现异常
     * JVM会做两件事：
     *      1.JVM会根据异常产生的原因创建一个异常对象，这个异常对象包含了异常产生的（内容，原因，位置）。
     *      2.在getElement方法中，没有异常的处理逻辑（try-catch），那么JVM就会把异常对象抛出给方法的调用者来处理这个异常。
     */
    private static int getElement(int[] arr, int index) {
        int ele = arr[index];
        return ele;
    }

    /**
     * 第三步：
     * JVM接收到了这个异常对象，就做了两件事情：
     *      1.把异常对象（内容，原因，位置）以红色的字体打印在控制台。
     *      2.JVM会终止当前正在执行的java程序--->中断处理。
     */
}
