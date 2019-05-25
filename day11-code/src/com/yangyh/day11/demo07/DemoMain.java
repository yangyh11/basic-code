package com.yangyh.day11.demo07;


/**
 * @description: 接口作为成员变量类型
 * @author: yangyh
 * @create: 2019-05-25 22:47
 */
public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("后裔");

        // 1.使用匿名对象
//        hero.setSkill(new SkillImpl());

        // 2.使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia");
//            }
//        };
//        hero.setSkill(skill);

        // 3.使用匿名内部类的匿名对象 hero.setSkill(() -> System.out.println("Biu~Pia~Biu~Pia~"));
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~Pia~Biu~Pia~");
            }
        });
        hero.attack();

    }
}
