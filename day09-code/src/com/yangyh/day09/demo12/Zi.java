package com.yangyh.day09.demo12;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-29 14:42
 **/
public class Zi extends Fu {

    public Zi() {
//        super();
        System.out.println("子类构造方法执行！");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭！");
    }
}
