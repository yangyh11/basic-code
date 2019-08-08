package com.yangyh.day14.demo03.exception;

import java.io.FileNotFoundException;

/**
 * @description: finally代码块
 * @author: yangyh
 * @create: 2019-07-04 22:56
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
 *      } finally {
 *          无论是否出现异常都会执行
 *      }
 * 注意：
 *      1.finally不能单独使用，必须和try一起使用。
 *      2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放（IO).
 */
public class Demo01Finally {

    public static void main(String[] args) {
        try {
            // 可能会产生异常的代码
            readFile("c:\\c.txt");
        } catch (FileNotFoundException e) {
            // 异常的处理逻辑
             System.out.println(e);
        } finally {
            // 无论是否出现异常，都会执行
            System.out.println("finally代码块-资源释放");
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
