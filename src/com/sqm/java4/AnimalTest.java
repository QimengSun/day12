package com.sqm.java4;
import java.sql.*;
/**
 * @author: sqm
 * @date: 2020/8/12 20:27
 * @description:
 */

//多态性的使用举例一
public class AnimalTest {

    public static void main(String[] args) {//Animal animal = new Dog();
        AnimalTest test = new AnimalTest();//只能调用animal方法 运行的是dog重写父类方法
        test.func(new Dog());
    }




    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}


class Animal{


    public void eat(){
        System.out.println("动物：进食");
    }

    public void shout(){
        System.out.println("动物：叫");
    }


}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void shout(){
        System.out.println("汪！汪！汪！");
    }

    public void watchDoor(){
        System.out.println("看门");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void shout(){
        System.out.println("喵！喵！喵！");
    }




}

//举例二
class Order{

    public void method(Object obj){

    }
}

//举例三

class Driver(){
    public void doData(Connection conn){//conn = new MySQLConnection
        //规范的步骤
        //conn.close();
    }
}