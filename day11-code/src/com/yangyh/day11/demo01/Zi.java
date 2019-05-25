package com.yangyh.day11.demo01;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-07 17:12
 **/
public class Zi extends Fu {

    @Override
    public void method() {
        System.out.println("子类方法执行");
    }

    // 错误写法，final方法不能不覆盖重写
//    public void methodFianl(){
//
//    }
}
