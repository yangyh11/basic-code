package com.yangyh.day14.demo01.exception;

import java.util.Objects;

/**
 * @description: Objects非空判断的方法_requireNonNull
 * @author: yangyh
 * @create: 2019-06-27 23:05
 * java.util.Objects类中的静态方法
 * public static <T> T requireNonNull(T obj)    // 查看指定的引用对象是不是null
 * 源码：
 * public static <T> T requireNonNull(T obj, String message) {
 *         if (obj == null)
 *             throw new NullPointerException(message);
 *         return obj;
 *     }
 */
public class Demo04Objects {
    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object obj) {
        // 对传递进来的参数进行合法性判断，判断是否为null
//        if (obj == null) {
//            throw new NullPointerException("传递的对象的值是null");
//        }

        // 使用Objects.requireNonNull(obj)方法
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的对象的值是null");
    }
}
