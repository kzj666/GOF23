package com.kk.demo;

/*
@author kzj
@date 2020/4/15 - 16:40
*/

import java.util.Date;

//使用原型实例指定将要创建的对象类型，通过复制这个实例创建新的对象。
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        User user1 = new User("彭于晏", date);
        System.out.println(user1.toString());

        System.out.println("============================================================");
        User user2 = (User)user1.clone();
        //改变user2的时间，发现user1也改变了，所以clone只进行了浅克隆，只克隆了引用，这不符合我们的需求（去改写clone方法）
        date.setTime(1351313515);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
