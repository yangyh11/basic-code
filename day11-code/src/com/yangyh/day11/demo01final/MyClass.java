package com.yangyh.day11.demo01final;

/**
 * @description: final关键字用于修饰类
 * @author: yangyh
 * @create: 2019-05-07 17:04
 *
 * 当final关键字用来修饰一个类的时候，格式：
 * public final class 类名称 {
 *     // ...
 * }
 *
 * 含义：当前这个类不能有任何子类。（太监类）
 * 注意：一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为没儿子）
 **/
public final class MyClass {

    public void method() {
        System.out.println("方法执行！");
    }
}
