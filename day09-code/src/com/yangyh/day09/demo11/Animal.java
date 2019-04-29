package com.yangyh.day09.demo11;

/**
 * @description: 抽象方法与抽象类的格式
 * @author: yangyh
 * @create: 2019-04-26 19:08
 *
 * 抽象方法：就是在方法的返回值类型前面加上abstract关键字，去掉大括号方法体，直接分号结束。
 * 抽象类：抽象方法所在的类，必须是抽象类才行。在class之前加上abstract关键字。
 *
 * 如何使用抽象类与抽象方法：
 * 1.不能直接new创建抽象类对象。
 * 2.必须用一个子类来继承抽象类。
 * 3.子类必须覆盖重写抽象类中所有的抽象方法。
 * 覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上大括号方法体。
 * 4.创建子类对象进行使用。
 **/
public abstract class Animal {

//    这是一个抽象方法，代表吃东西，但是具体吃什么(方法体)不确定
    public abstract void eat();

    //普通的成员方法
    public void normalMethod(){

    }
}
