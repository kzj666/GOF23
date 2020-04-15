package com.kk.singleton;

/*
@author kzj
@date 2040/1/21 - 18:34
*/

import java.lang.reflect.Constructor;

//静态内部类实现
public class SingletonDemo04 {

    //1.私有化构造器
    private SingletonDemo04(){

    }
    //私有静态内部类中new出对象
    private static class InnerClass{
        private static final SingletonDemo04 instance = new SingletonDemo04();
    }

    public static SingletonDemo04 getInstance(){
        return InnerClass.instance;
    }
}

//反射机制，可以破坏我们以上的单例
class SingletonDemo04Test{
    public static void main(String[] args) throws Exception {

        SingletonDemo04 instance = SingletonDemo04.getInstance();

        Constructor<SingletonDemo04> declaredConstructor = SingletonDemo04.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SingletonDemo04 instance2 = declaredConstructor.newInstance();

        System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}
