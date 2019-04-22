package com.yangyh.day06.demo03;

/**
 * @description: 使用private关键字
 * @author: yangyh
 * @create: 2019-04-20 10:19
 *
 * 对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而Setter方法规则不变，setXxx
 **/
public class Student {

    private String name;
    private int age;
    private boolean male;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
