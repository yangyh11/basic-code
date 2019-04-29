package com.yangyh.day09.demo14;

import java.util.ArrayList;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-29 16:57
 **/
public class DemoMain {

    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        manager.show();
        one.show();
        two.show();
        three.show();

        System.out.println("==========================");

        ArrayList list = manager.send(40, 3);
        System.out.println("抢到红包金额：" + one.reccrive(list));
        System.out.println("抢到红包金额：" + two.reccrive(list));
        System.out.println("抢到红包金额：" + three.reccrive(list));

        System.out.println("==========================");

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
