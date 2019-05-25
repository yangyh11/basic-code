package com.yangyh.day11.demo06;

/**
 * @description: 类作为成员变量类型
 * @author: yangyh
 * @create: 2019-05-25 22:30
 */
public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        // 为英雄起一个名字，并设置年龄
        hero.setName("盖伦");
        hero.setAge(20);

        // 创建一个武器
        Weapon weapon = new Weapon("多兰剑");
        // 为影响配备武器
        hero.setWeapon(weapon);
        // 英雄攻击
        hero.attack();
    }
}
