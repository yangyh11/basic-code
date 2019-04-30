package com.yangyh.day10.demo01;

/**
 * @description: 接口的默认方法定义
 * @author: yangyh
 * @create: 2019-04-30 11:16
 *
 * 从Java8开始，接口里允许定义默认方法。
 * 格式：
 * public default 返回值类型 方法名称(参数列表) {
 *     方法体
 * }
 *
 * 备注：接口中的默认方法，可以解决接口升级的问题。
 * public关键字可以省略，default关键字不能省略
 **/
public interface MyInterfaceDefault {

    // 抽象方法
    public abstract void methodAbs();

    // 接口升级，新添加一个抽象方法,实现类也必须得修改，否则报错。
//    public abstract void methodAbs2();

    // 接口升级，新添加的方法改为默认方法就可以解决
    //public关键字可以省略，default关键字不能省略
    public default void methodAbsDefault() {
        System.out.println("这是新添加的默认方法");
    }

}
