package com.yangyh.day06.demo02;

/**
 * @description: 手机类练习
 * @author: yangyh
 * @create: 2019-04-18 10:40
 **/
public class Demo01PhoneOne {

    public static void main(String[] args) {
        Phone one = new Phone();

        one.brand = "华为";
        one.color = "白色";
        one.price = 4500.99;

        System.out.println("品牌：" + one.brand);
        System.out.println("颜色：" + one.color);
        System.out.println("价格：" + one.price);

        String name = "张三";
        one.call(name);
        one.sendMessage();
    }
}
