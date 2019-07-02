package com.yangyh.day14.demo01.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @description: 异常处理的第二种方式-自己处理异常
 * @author: yangyh
 * @create: 2019-07-02 23:31
 * try...catch:异常处理的第二种方式，自己处理异常
 * 格式：
 *      try{
 *          可能产生异常的代码
 *      } catch(定义一个异常的变量，用来接收try中抛出的异常对象) {
 *          异常的处理逻辑，接收异常对象之后，怎么处理异常对象
 *          一般在工作中，会把异常的信息记录到一个日志中
 *      }
 *      ...
 *      catch(异常对象 变量名) {
 *
 *      }
 * 注意：
 *      1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理异常对象。
 *      2.如果try中产生了异常，那么就会执行catch中的处理逻辑，执行完毕后catch中的处理逻辑，继续实行try...catch之后的代码。
 *      3.如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完try中的代码，继续执行try...catch之后的代码。
 */
public class Demo06TryCatch {

    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) { // try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
            // 异常的处理逻辑，接收异常对象之后，怎么处理异常对象
            System.out.println("catch-传递的文件后缀名不是.txt");
        }
        System.out.println("后续代码");
    }

    private static void readFile(String fileName) throws IOException {
//        if (!"c:\\a.txt".equals(fileName)) {
//            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
//        }

        /*
            如果传递的，不是.txt结尾，
            那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         */
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }

        System.out.println("文件路径没有问题，读取文件");
    }
}
