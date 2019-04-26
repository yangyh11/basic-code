package com.yangyh.day09.demo09;

/**
 * @description: 父类
 * @author: yangyh
 * @create: 2019-04-26 15:29
 **/
public class Fu {

    int num = 10;

    public Fu() {
        System.out.println("子类无参构造执行");
    }

    public Fu(int num) {
        this.num = num;
    }

    public void method() {
        System.out.println("父类的成员方法执行。");
    }
}
