package com.yangyh.day09.demo07;

/**
 * @description: 子类
 * @author: yangyh
 * @create: 2019-04-26 15:30
 **/
public class Zi extends Fu {

    public Zi() {
//        super(); //调用父类无参构造方法，不写时，默认调用无参构造
        super(20); //在调用父类重载的构造方法
        System.out.println("子类构造方法");
    }

    public void method() {
//        super(); //错误写法！只有子类构造方法才能调用父类的构造方法。
    }
}
