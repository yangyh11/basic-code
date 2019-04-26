package com.yangyh.day09.demo03;

/**
 * @description: 区分子类方法中重名的三种变量
 * @author: yangyh
 * @create: 2019-04-26 15:17
 *
 * 局部变量：直接写局部变量名
 * 成员变量：this.成员变量名
 * 父类的成员变量：super.父类成员变量名
 **/
public class Demo01ExtendsField {

    public static void main(String[] args) {

        Zi zi = new Zi();

        zi.method();
    }
}
