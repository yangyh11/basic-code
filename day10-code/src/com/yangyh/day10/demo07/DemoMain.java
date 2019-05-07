package com.yangyh.day10.demo07;

/**
 * @description:
 * @author: yangyh
 * @create: 2019-05-07 16:37
 **/
public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        // 准备一个鼠标，供电脑使用
        // 首先向上转型
        Usb usbMouse = new Mouse(); // 多态写法
        // 参数是Usb类型，我正好传递进去的就是Usb鼠标
        computer.useUsb(usbMouse);

        // 准备一个键盘
        Keyboard keyboard = new Keyboard(); // 没有使用多态写法
        // 方法参数是Usb类型，传递进去的是实现类对象
        computer.useUsb(keyboard); // 正确写法！也发生了向上转型
        // 使用实现类的匿名对象也可以
        computer.useUsb(new Keyboard()); // 也是正确的

        computer.powerOff();
    }
}
