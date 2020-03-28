package com.study.mode.factory.staticFactory;

import com.study.suanfa.genericity.Dog;

/**
 * @author cuit_mercy@163.com
 * @version V1.0.0
 * @ClassName Animal
 * @description <p>静态工厂的Demo</p>
 * @date 2020/3/27 15:16
 * @since V1.0.0
 **/
public class Animal {
    private static final Integer DOG = 1;
    private static final Integer CAT = 2;
    private static final Integer PIG = 3;

    private Integer value;
    private Animal(Integer val) {
        this.value = val;
    }

    /**
     * 静态工厂方法 --直接采用Animal.createDog()获取Animal对象，而不用关心里面的具体实现，
     * 也避免了外界传参导致的数据异常问题
     * @return
     */
    public static Animal createDog(){
        return new Animal(DOG);
    }
    public static Animal createCat(){
        return new Animal(CAT);
    }
    public static Animal createPig(){
        return new Animal(PIG);
    }

}
