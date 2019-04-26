package com.yangyh.day09.demo04;

/**
 * @description: 子类
 * @author: yangyh
 * @create: 2019-04-26 15:30
 **/
public class Zi extends Fu {

    public void methodZi(){
        System.out.println("父类方法执行");
    }

    @Override
    public void method(){
        System.out.println("子类同名方法执行");
    }
}
