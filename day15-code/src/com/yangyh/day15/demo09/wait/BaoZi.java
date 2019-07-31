package com.yangyh.day15.demo09.wait;

/**
 * @description: 资源类
 * @author: yangyh
 * @create: 2019-07-31 23:44
 * 资源类：包子类
 * 设置包子的属性：
 *      皮
 *      陷
 *      包子的状态：有 true，没有 false，设置初始值为false没有包子
 */
public class BaoZi {
    // 皮
    private String pi;
    // 陷
    private String xian;
    // 包子的状态：有 true，没有 false，设置初始值为false没有包子
    private boolean flag = false;

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
