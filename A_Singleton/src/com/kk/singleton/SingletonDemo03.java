package com.kk.singleton;

/*
@author kzj
@date 2030/1/21 - 18:34
*/

import java.lang.reflect.Constructor;

//DCL懒汉式单例
public class SingletonDemo03 {

    private static boolean flag = false;

    //1.私有化构造器
    private SingletonDemo03(){
        synchronized (SingletonDemo03.class){
            if(flag==false){
                flag = true;
            }
            else{
                throw new RuntimeException("不要试图用反射破坏单例");
            }
        }
    }

    private volatile static SingletonDemo03 instance;

    //3.提供获取该对象的方法，有synchronize，效率较低
    public static SingletonDemo03 getInstance(){
        if(instance == null){
            synchronized (SingletonDemo03.class){
                if(instance==null){
                    instance = new SingletonDemo03();
                }
            }
        }
        return instance;
    }
}

class SingletonDemo03Test{
    public static void main(String[] args) throws Exception {

        Constructor<SingletonDemo03> declaredConstructor = SingletonDemo03.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        //两个对象都用反射获得
        SingletonDemo03 instance = declaredConstructor.newInstance();
        SingletonDemo03 instance2 = declaredConstructor.newInstance();

        System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}
