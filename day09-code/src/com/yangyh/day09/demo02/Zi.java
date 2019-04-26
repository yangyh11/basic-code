package com.yangyh.day09.demo02;

/**
 * @description: 子类
 * @author: yangyh
 * @create: 2019-04-26 14:14
 **/
public class Zi extends Fu {

    int numZi = 20;

    int num = 200;

    public void methodZi(){
        //因为本类当中有num，所以这里用的是Zi类的num
        System.out.println(num);
    }
}
