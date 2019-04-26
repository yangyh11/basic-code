package com.yangyh.day09.demo03;

/**
 * @description: 子类
 * @author: yangyh
 * @create: 2019-04-26 15:21
 *
 * 局部变量：直接写局部变量名
 * 成员变量：this.成员变量名
 * 父类的成员变量：super.父类成员变量名
 **/
public class Zi extends Fu {

    int num = 200;
    public void method(){
        int num = 300;

        System.out.println("子类方法中的局部变量值：" + num);
        System.out.println("子类中的成员变量值" + this.num);
        System.out.println("父类中的成员变量值" + super.num);
    }

}
