package com.sqm.java4;

/**
 * @author: sqm
 * @date: 2020/8/12 20:08
 * @description:
 */
public class Man extends Person{
    boolean isSmoking;

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");

    }

    @Override
    public void eat(){
        System.out.println("Eat! More eat！");
    }

    public void walk(){
        System.out.println("Walk! More road");
    }
}
