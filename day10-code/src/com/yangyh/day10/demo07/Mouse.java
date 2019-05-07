package com.yangyh.day10.demo07;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-07 16:32
 **/
public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}
