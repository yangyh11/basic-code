package com.yangyh.day08.demo03;

/**
 * @description: 静态static关键字修饰成员方法
 * @author: yangyh
 * @create: 2019-04-25 15:31
 *
 * 一旦使用static修饰成员变量方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类。
 *
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
 * 如果有了static关键字，那么不需要创建对象，直接就能通过类名称就来使用它。
 *
 *无论是成员变量还是成员方法，如果有了static，都推荐使用类名称来调用。
 * 静态变量：类名称.静态变量
 * 静态方法：类名称.静态方法名
 *
 * 注意事项：
 * 1.静态不能访问静态。
 * 原因：在内存中，是【先】有的静态内容，【后】有的非静态内容。
 * “先人不知道后人，后人知道先人”
 * 2.静态方法当中不呢能使用this关键字。
 * 原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。静态方法是属于类，在对象没有创建时候，就已经有静态方法了，静态方法【先】对象【后】
 **/
public class Demo02StaticMethod {

    public static void main(String[] args) {
        //首先创建对象
        MyClass obj = new MyClass();
        //然后才能使用没有static关键字的内容
        obj.method();

        //对于静态方法来说，可以通过对象名来调用，也可以直接通过类名来调用。推荐直接使用类名来调用
        obj.methodStatic(); //正确，不推荐，无谓增加编译成本。这种写法在编译之后也会被javac翻译成“类名称.静态方法名”
        MyClass.methodStatic(); //正确，推荐。

        //对于本类中的静态方法，可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod(); //完全等效
    }


    public static void myMethod(){
        System.out.println("我自己的方法。");
    }
}
