package com.yangyh.day06.demo03;

/**
 * @description: private关键字的使用与作用
 * @author: yangyh
 * @create: 2019-04-18 14:40
 *
 * 问题描述：定义Person的时候，无法阻止不合理的数值被设置进来。
 * 解决方法：用private关键字将需要保护的成员变量保护起来。
 *
 * 一旦使用private进行修饰，那么本类当中仍然可以随意访问。
 * 但是，超出本类范围之外的就不能访问了。
 *
 * 间接访问private成员变量，就是定义一堆Getter/Setter方法。
 *
 * 必须叫setXxx或者是getXxx命名规则。
 * 对于Getter来说，不能有参数，返回值类型与成员变量对应。
 * 对于Setter来水，不能有返回值，参数类型与成员变量对应。
 **/
public class Person {

    private String name;
    private int age;

    //这个成员方法，专门用于获取name的值
    public String getName() {
        return name;
    }

    //这个成员方法，专门用于向name设置数据
    public void setName(String name) {
        this.name = name;
    }

    //这个成员方法，专门用于获取age的值
    public int getAge() {
        return age;
    }

    //这个成员方法，专门用于向age设置数据
    public void setAge(int age) {
        if (age < 100 && age >= 0){
            this.age = age;
        } else {
            System.out.println("数据不合理");
        }

    }

    public void show(){

        System.out.println("姓名" + name);
        System.out.println("年龄" + age);

    }
}
