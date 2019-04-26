package com.yangyh.day09.demo06;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-04-26 16:36
 * 新款手机，使用老款手机作为父类
 **/
public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show(); //把父类的show()方法拿过来重复利用
        //自己子类再来添加更多的内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
