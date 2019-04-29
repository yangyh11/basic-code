package com.yangyh.day09.demo14;

import java.util.ArrayList;

/**
 * @description: 群主
 * @author: yangyh
 * @create: 2019-04-26 19:33
 **/
public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    //发红包
    public ArrayList<Integer> send(int totalMoney, int count) {
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看一下群主自己有多少钱
        int leftMoney = this.getMoney(); //群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足...");
            return redList;
        }

        //扣钱，其实就是重新设置余额
        this.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; //余数，也就是剩下的零头

        //除不开的零头，包在最后一个红包中
        //下面把红包一个个放入集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
