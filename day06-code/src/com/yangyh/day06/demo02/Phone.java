package com.yangyh.day06.demo02;

/**
 * @description: 手机类练习
 * @author: yangyh
 * @create: 2019-04-18 10:36
 **/
public class Phone {

    //成员变量(属性)
    String brand; //品牌
    double price; //价格
    String color; //颜色

    //成员方法(行为)
    public void call (String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }


}
