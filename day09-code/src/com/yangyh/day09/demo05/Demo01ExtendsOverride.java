package com.yangyh.day09.demo05;

/**
 * @description: 继承中方法的覆盖重写
 * @author: yangyh
 * @create: 2019-04-26 16:16
 *
 * 方法覆盖重写的注意事项：
 * 1.必须保证父子类之间方法的名称相同，参数列表也相同。
 * @Override：写在方法前面，用来检测是不是有效的的正确覆盖重写。
 * 这个注解就算不写，只要满足要求，也是正确的方法覆盖重写。该注解只是做个安全检查
 *
 * 2.子类方法的返回值必须【小于等于】父类方法的返回值范围。
 * 小扩展提示：java.lang.Object类是所有类的公共最高父类（祖宗类），java.lang.String就是Object类的子类。
 *
 * 3.子类方法的修饰符权限必须【大于等于】父类方法的权限修饰符。
 * 小扩展提示：public > protected > (default) > private
 * 备注：(default)不是关键字的default，而是什么都不写，留空，默认
 **/
public class Demo01ExtendsOverride {
}
