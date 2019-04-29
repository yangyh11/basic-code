package com.yangyh.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

/**
 * @description: 群员类
 * @author: yangyh
 * @create: 2019-04-29 16:28
 **/
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public int reccrive(ArrayList<Integer> list) {
        // 从多个红包当中抽取一个，给我自己
        // 随机获取集合当中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合中删除，并且得到被删除的红包，给我自己
        int delta = list.remove(index);
        // 该成员当前有多少钱
        int money = this.getMoney();
        // 加法，加上刚刚抢到的的红包
        this.setMoney(delta + money);
        // 返回抢到的红包数
        return delta;
    }
}
