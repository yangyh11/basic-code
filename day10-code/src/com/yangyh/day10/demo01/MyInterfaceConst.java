package com.yangyh.day10.demo01;

/**
 * @description: 接口的常量的定义
 * @author: yangyh
 * @create: 2019-04-30 16:04
 *
 * 接口当中也可以定义定义“成员变量”，但是必须使用public static final 三个关键字修饰。
 * 从效果上看，就是接口的【常量】。
 * 格式：
 * public static final 数据类型 常量名称 = 数据值;
 * 备注：
 * 一旦使用final关键字进行修饰，说明不可改变。
 *
 * 注意事项：
 * 1.接口当中的常量，可以省略public static final，注意：不写修饰符，也是照样的
 * 2.接口当中的常量，必须进行赋值；不能不赋值。
 * 3.接口中的常量命名，使用完全大写的字母，用下划线进行分隔。（推荐命名规则）
 **/
public interface MyInterfaceConst {

    // 这其实就是一个常量，一旦赋值，不可改变
    public static final int NUM_OF_CLASS = 12;

    // 省略修饰符也是常量
    int NUM_OF_AGE = 20;
}
