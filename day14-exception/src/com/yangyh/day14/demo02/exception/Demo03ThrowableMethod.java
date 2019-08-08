package com.yangyh.day14.demo02.exception;

import java.io.FileNotFoundException;

/**
 * @description: Throwable类中3个处理异常的方法
 * @author: yangyh
 * @create: 2019-07-04 22:23
 * Throwable类中定义了3个异常处理的方法：
 * 1.public String getMessage()    // 返回此throwable的简短描述。
 * 2.public String toString()      // 返回此throwable的详细消息字符串。
 * 3.public void printStackTrace() // JVM打印异常对象，默认此方法，打印的异常信息是最全面的。
 */
public class Demo03ThrowableMethod {

    public static void main(String[] args) {
        try {
            readFile("c:\\c.txt");
        } catch (FileNotFoundException e) { // try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
            // 异常的处理逻辑，接收异常对象之后，怎么处理异常对象
            // System.out.println("传递的文件路径不是c:\\a.txt");

            System.out.println(e.getMessage()); // 传递的文件路径不是c:\a.txt

            // 重写Object类的toString方法
            System.out.println(e.toString());   // java.io.FileNotFoundException: 传递的文件路径不是c:\a.txt
            System.out.println(e);      // java.io.FileNotFoundException: 传递的文件路径不是c:\a.txt

            /**
             java.io.FileNotFoundException: 传递的文件路径不是c:\a.txt
             at com.yangyh.day14.demo02.exception.Demo03ThrowableMethod.readFile(Demo03ThrowableMethod.java:34)
             at com.yangyh.day14.demo02.exception.Demo03ThrowableMethod.main(Demo03ThrowableMethod.java:18)
             */
            // 打印完整的堆栈信息
            e.printStackTrace();
        }

        System.out.println("后续代码");
    }

    private static void readFile(String fileName) throws FileNotFoundException {
        if (!"c:\\a.txt".equals(fileName)) {
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }

        System.out.println("文件路径没有问题，读取文件");
    }
}
