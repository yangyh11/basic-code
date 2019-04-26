package com.yangyh.day09.demo09;

/**
 * @description: 子类
 * @author: yangyh
 * @create: 2019-04-26 15:30
 *
 * super关键字用来访问父类内容，而this关键字用来访问本类的内容。用法也有三种：
 *
 * 1。在本类的成员方法中，访问本类的成员变量。
 * 2.在本类的成员方法中，调用本类的成员方法。
 * 3.在本类的构造方法中，调用本类的构造方法。
 * 在第三种用法中【注意】：
 * A.this(...)也必须是构造方法中的第一个语句，也只能有一个this(...)语句。
 * B.在构造方法中，super(...)和this(...)两种构造调用不能同时使用。
 **/
public class Zi extends Fu {

    int num = 20;

    public Zi() {
        this(12); //调用本类的构造方法
    }

    public Zi(int num) {
        this.num = num;
    }

    @Override
    public void method() {

        //局部变量
        int num = 30;

        System.out.println("访问本方法的局部变量" + num);
        System.out.println("访问本类的成员变量" + this.num);
        System.out.println("访问父类的成员变量" + super.num);
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {

        this.methodA(); //调用本类的成员方法
        System.out.println("BBB");
    }

}
