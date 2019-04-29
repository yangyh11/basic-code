package com.yangyh.day09.demo10;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-29 17:28
 **/
public class Zi extends Fu {

    int num = 20;

    @Override
    public void method() {
        System.out.println("子类方法执行");
        super.method();
    }

    public void show() {
        //局部变量
        int num = 30;

        System.out.println("访问本方法的局部变量" + num);
        System.out.println("访问本类的成员变量" + this.num);
        System.out.println("访问父类的成员变量" + super.num);
    }
}
