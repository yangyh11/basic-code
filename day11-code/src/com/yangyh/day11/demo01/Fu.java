package com.yangyh.day11.demo01;

/**
 * @description: final关键字用于修饰成员方法
 * @author: yangyh
 * @create: 2019-05-07 17:11
 *
 * 当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写。
 * 格式：
 * 修饰符 final 返回值类型 方法名(参数列表) {
 *     方法体
 * }
 *
 * 【注意事项】
 * 对于类、方法来说，abstract和final关键字不能同时使用，因为矛盾。
 **/
public class Fu {

    public void method() {
        System.out.println("父类方法执行");
    }

    public final void methodFianl() {
        System.out.println("父类final方法执行");
    }

//    public abstract final void methodAbs();
}
