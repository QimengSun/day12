package com.sqm.java4;

/**
 * @author: sqm
 * @date: 2020/8/12 20:16
 * @description:
 */
/*
 *
 * 类的继承、方法的重写
 *
 */


public class PeronTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        Man man = new Man();


        //*************************************************
        //子类对象的多态性；父类的引用指向子类的对象
        Person p2 = new Man();

        Person p3 = new Woman();

        //调用的为子类重写父类的方法 ————虚拟方法调用
        p2.eat();
//      p2.earnMoney();  //无法调用子类特有的方法 看的是父类的方法


        //多态的使用 ——————调用的是父类的方法，使用的是子类的方法。
    }
}
