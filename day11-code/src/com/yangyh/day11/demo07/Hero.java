package com.yangyh.day11.demo07;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-25 22:37
 */
public class Hero {
    /** 英雄的名字**/
    private String name;
    /** 英雄的技能**/
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack() {
        System.out.println("我叫" + name + "，开始施放技能：");
        skill.use();
        System.out.println("施放技能完成");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
