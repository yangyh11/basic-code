package com.yangyh.day14.demo04.myexception;

/**
 * @description: 自定义异常
 * @author: yangyh
 * @create: 2019-07-14 23:08
 * 自定义异常类：
 * java提供的异常类，不够我们使用，需要自定义一些异常类。
 * 格式：
 * public class xxxException extends Exception 或者 RuntimeException{
 *      添加一个空参数构造方法
 *      添加一个带异常信息的构造方法
 * }
 * 注意：
 * 1.自定义异常类一般都是以Exception结尾，表明这是一个异常类。
 * 2.自定义异常类，必须得继承Exception或者RuntimeException。
 * 继承Exception：那么自定义异常就是一个运行期异常，如果方法内部抛出了编译器异常，就必须处理这个异常，要么throws，要么try...catch
 * 继承RuntimeException：那么自定义异常就是一个运行期异常，无需处理，交给虚拟机处理（中断处理）。
 */
public class RegistException extends Exception {

    /**
     * 添加一个空参数构造方法
     **/
    public RegistException() {
    }

    /**
     * 添加一个带异常信息的构造方法
     * 查看源码发现，所有的异常类都会有一个带异常信息的构造方法，方法内部会调用父类带异常信息的构造方法，
     * 让父类来处理这个异常信息。
     **/
    public RegistException(String message) {
        super(message);
    }

}
