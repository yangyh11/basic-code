package com.yangyh.day09.demo04;

/**
 * @description: 继承中成员方法的访问特点
 * @author: yangyh
 * @create: 2019-04-26 15:32
 *
 * 在父子类继承关系中，创建子类对象后，访问成员方法的规则：
 *  创建的对象是谁，就优先用谁，如果没有就往上找。
 *
 * 注意事项：
 * 无论是成员方法还是成员变量，如果没有都是向上找父类，绝不会向下找子类的。
 *
 * 重写（Override）：
 * 概念：在继承关系当中，方法的名称一样，参数列表也一样。
 *
 * 重写（Override）：方法名称一样，参数列表【也一样】。也叫覆盖、覆写
 * 重载（Overload）：方法名称一样，参数列表【不一样】。
 **/
public class Demo01ExtendsMethod {

    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFu();
        zi.methodZi();

        //创建的对象是子类的，就优先用子类的方法
        zi.method();
    }
}
