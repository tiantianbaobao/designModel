package com.study.suanfa.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cuit_mercy@163.com
 * @version V1.0.0
 * @ClassName Dog
 * @description <p>TODO</p>
 * @date 2020/3/25 16:31
 * @since V1.0.0
 **/
public class Dog implements Animals{
    public static void say(List<? extends Animals> animals) {
        for (Animals animal: animals) {
            System.out.println(animal);
        }
        System.out.println("Dog class say()");
    }
    public static void say2(List<Animals> animals) {
        for (Animals animal: animals) {
            System.out.println(animal);
        }
        System.out.println("say2()");
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Animals> animals = new ArrayList<>();
        say(dogs);
        say2(animals);
        Class<Dog> clazz = Dog.class;
        Class<?> clas = Dog.class.getClass();
        Class cl = clazz.getClass();
        System.out.println(clazz);
        System.out.println(cl);
        System.out.println(clas);
    }
}
