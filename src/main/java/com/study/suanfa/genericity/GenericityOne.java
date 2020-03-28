package com.study.suanfa.genericity;

/**
 * @author cuit_mercy@163.com
 * @version V1.0.0
 * @ClassName GenericityOne
 * @description <p>TODO</p>
 * @date 2020/3/25 16:18
 * @since V1.0.0
 **/
public interface GenericityOne {
    static <T> T test(Class<T> clazz) {
        return null;
    }
}
