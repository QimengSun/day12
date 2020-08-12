package com.sqm.java;

/**
 * @author: sqm
 * @date: 2020/8/12 19:51
 * @description:子类对象实例化全过程
 */

/*
 * 1.从结果上看
 *     子类获取了父类的所有属性和方法
 * 2.从过程上来看
 *     子类构造器创建子类对象 一定会间接调用父类的构造器 直至 java.lang.Object中的空参构造器为主
 *
 */
public class Instancetest {
}
