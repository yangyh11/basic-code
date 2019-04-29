package com.yangyh.day09.demo14;

/**
 * @description: 用户类
 * @author: yangyh
 * @create: 2019-04-26 19:29
 **/
public class User {

    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void show() {
        System.out.println("我叫" + name + " 我的余额有" + money);
    }
}
