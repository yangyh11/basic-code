package com.yangyh.day10.demo07;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-07 16:29
 **/
public class Computer {

    public void powerOn() {
        System.out.println("笔记本开机");
    }

    public void powerOff() {
        System.out.println("笔记本关机");
    }

    public void useUsb(Usb usb) {

        usb.open(); // 打开设备

        if (usb instanceof Mouse) { // 一定要先判断
            Mouse mouse = (Mouse) usb; // 向下转型
            mouse.click();
        } else if (usb instanceof Keyboard) { // 先判断
            Keyboard keyboard = (Keyboard) usb; // 向下转型
            keyboard.type();
        }

        usb.close(); // 关闭设备

    }
}
