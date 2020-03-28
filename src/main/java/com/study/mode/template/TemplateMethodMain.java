package com.study.mode.template;

/**
 * @author cuit_mercy@163.com
 * @version V1.0.0
 * @ClassName TemplateMethodMain
 * @description <p>TODO</p>
 * @date 2020/3/28 21:30
 * @since V1.0.0
 **/
public class TemplateMethodMain {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay("HELLO WORLD!");
        AbstractDisplay stringDisplay = new StringDisplay("你好，世界！");

        charDisplay.display();
        stringDisplay.display();
    }
}
