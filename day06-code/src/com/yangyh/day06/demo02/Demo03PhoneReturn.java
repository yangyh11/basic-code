package com.yangyh.day06.demo02;

/**
 * @description: 使用对象类型作为方法的返回值
 * @author: yangyh
 * @create: 2019-04-18 13:40
 *
 * 当使用一个对象类型作为方法的返回值时，返回值其实就是对象的地址值。
 **/
public class Demo03PhoneReturn {

    public static void main(String[] args) {
        Phone one = getPhone();

        System.out.println("品牌：" + one.brand);
        System.out.println("颜色：" + one.color);
        System.out.println("价格：" + one.price);
    }

    public static Phone getPhone() {
        Phone p = new Phone();
        p.brand = "苹果";
        p.color = "黑色";
        p.price = 8883.2;

        return p; //返回的是对象的地址值
    }
}
