package com.yangyh.day09.demo08;

/**
 * @description: 子类
 * @author: yangyh
 * @create: 2019-04-26 15:30
 *
 * super关键字的用法有三种：
 * 1.在子类的成员方法中，访问父类的成员变量。
 * 2.在子类的成员方法中，调用父类的成员方法。
 * 3.在子类的构造方法中，调用父类的构造方法。
 **/
public class Zi extends Fu {

    int num = 20;

    public Zi() {
        super(); //调用父类的构造方法,默认就是调用无参构造，可省略。
    }

    public Zi(int num) {
        super(20); //调用父类的构造方法。
        this.num = num;
    }

    @Override
    public void method() {
        System.out.println("访问子类的成员变量" + num);
        System.out.println("访问父类的成员变量" + super.num); //访问父类的成员变量

        super.method(); //调用父类的成员方法
    }



}
