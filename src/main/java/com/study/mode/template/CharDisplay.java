package com.study.mode.template;

/**
 * @author cuit_mercy@163.com
 * @version V1.0.0
 * @ClassName CharDisplay
 * @description <p>{@link AbstractDisplay} 的一个子类</p>
 * @date 2020/3/28 20:58
 * @since V1.0.0
 **/
public class CharDisplay extends AbstractDisplay{
    private String msg;

    public CharDisplay(String msg) {
        this.msg = msg;
    }
    @Override
    public void open() {
        System.out.println(">>>>>>>>");
    }

    @Override
    public void print() {
        System.out.println(msg);
    }

    @Override
    public void close() {
        System.out.println("<<<<<<<<");
    }
}
