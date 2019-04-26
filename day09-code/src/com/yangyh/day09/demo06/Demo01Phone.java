package com.yangyh.day09.demo06;

/**
 * @description: 继承中方法覆盖重写的应用场景
 * @author: yangyh
 * @create: 2019-04-26 16:34
 *
 * 设计原则：对于已经投入使用的类(Phone)，尽量不要进行修改。
 *         推荐定义一个新的类(NewPhone)，来重复使用其中的共性内容，并且添加新内容。
 **/
public class Demo01Phone {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();

        System.out.println("======================");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
