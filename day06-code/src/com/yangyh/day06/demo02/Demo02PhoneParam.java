package com.yangyh.day06.demo02;

/**
 * @description: 使用对象作为方法的参数
 * @author: yangyh
 * @create: 2019-04-18 13:34
 *
 * 当一个对象作为参数，传递到方法当中时，实际上传递进去的是对象的地址值。
 **/
public class Demo02PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();

        one.brand = "苹果";
        one.color = "黑色";
        one.price = 8883.2;

        method(one); //传递进去的参数就是地址值

    }

    public static void method(Phone param){

        System.out.println("品牌：" + param.brand);
        System.out.println("颜色：" + param.color);
        System.out.println("价格：" + param.price);

    }
}
