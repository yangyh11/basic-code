package com.yangyh.day07.demo02.anonymous;

/**
 * @description: 匿名对象的说明
 * @author: yangyh
 * @create: 2019-04-21 21:43
 *
 * 创建对象的标准格式：
 * 类名称 对象名 = new 类名称();
 *
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
 * 匿名对象的创建格式：
 * new 类名称();
 * 注意事项：匿名对象能使用一次，下次再用不得不再创建一个新对象。
 * 使用建议：如果确定有一个对象只需要使用一次，就可以使用匿名对象。
 **/
public class Demo01Anonymous {

    public static void main(String[] args) {

        Person one = new Person();
        one.name = "高圆圆";

        one.show(); // 高圆圆

        //匿名对象
        new Person().name = "赵又廷";
        // 这又是一个新的匿名对象
        new Person().show(); // null
    }
}
