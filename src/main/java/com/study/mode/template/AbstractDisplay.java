package com.study.mode.template;

/**
 * @author cuit_mercy@163.com
 * @version V1.0.0
 * @ClassName AbstractDisplay
 * @description <p>定义抽象父类</p>
 * @date 2020/3/28 20:55
 * @since V1.0.0
 **/
public abstract class AbstractDisplay {
    /**
     * 定义抽象方法 open
     */
    public abstract void open();

    /**
     * 定义抽象方法 print
     */
    public abstract void print();

    /**
     * 定义抽象方法close（）
     */
    public abstract void close();
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
