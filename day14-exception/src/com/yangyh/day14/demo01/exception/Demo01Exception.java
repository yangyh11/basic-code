package com.yangyh.day14.demo01.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 异常分类
 * @author: yangyh
 * @create: 2019-06-26 23:25
 * java.lang.Throwable类是Java语言中所有错误或异常的超类。
 * Exception：编译期异常，进行编译（写代码）java程序出现的问题。
 * RuntimeException：运行期异常，java程序运行过程中出现的问题。
 * 异常就相当于程序得了一个小毛病（感冒，发烧），把异常处理掉，程序可以继续执行（吃点药，继续革命工作）
 * Error：错误
 * 错误就相当于程序得了一个无法治愈的毛病（非典，艾滋），必须修改源码，程序才能继续执行
 */
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {

        method01();
    }

    /**
     * Exception：编译器异常，进行编译（写代码）java程序出现的问题
     */
    private static void method01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1999-0909");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

    /**
     * RuntimeException：运行期异常，java程序运行过程中出现的问题
     */
    private static void method02() {
        int[] arr = {1, 2, 3};
        try {
            // 可能会出现的异常
            System.out.println(arr[3]);
        } catch (Exception e) {
            // 异常的处理逻辑
            e.printStackTrace();
        }
    }

    /**
     * Error：错误
     * OutOfMemoryError: Java heap space
     * 内存溢出的错误，创建的数组太大了，超出了给JVM分配的内存
     */
    private static void method03() {
        // int[] arr = new int[1024*1024*1024];
        // 必须修改代码，创建的数组小一点
        int[] arr = new int[1024 * 1024];
        System.out.println("后续代码");
    }
}
