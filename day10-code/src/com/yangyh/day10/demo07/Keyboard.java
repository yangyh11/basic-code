package com.yangyh.day10.demo07;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-07 16:32
 **/
public class Keyboard implements Usb {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("键盘输入");
    }
}
