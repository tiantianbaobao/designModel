package com.study.mode.template;

/**
 * @author cuit_mercy@163.com
 * @version V1.0.0
 * @ClassName StringDisplay
 * @description <p>{@link AbstractDisplay} 的子类</p>
 * @date 2020/3/28 21:00
 * @since V1.0.0
 **/
public class StringDisplay extends AbstractDisplay {

    private String msg;

    public StringDisplay(String msg) {
        this.msg = msg;
    }

    @Override
    public void open() {
        System.out.println("||||||||||||");
    }

    @Override
    public void print() {
        System.out.println(msg);
    }

    @Override
    public void close() {
        System.out.println("|||||||||||||");
    }

}
