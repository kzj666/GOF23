package com.kk.singleton;

/*
@author kzj
@date 2020/1/21 - 18:34
*/

//懒汉式单例
public class SingletonDemo02 {

    //1.私有化构造器
    private SingletonDemo02(){

    }

    private static SingletonDemo02 instance;

    //3.提供获取该对象的方法，有synchronize，效率较低
    public static synchronized SingletonDemo02 getInstance(){
        if(instance == null){
            instance = new SingletonDemo02();
        }
        return instance;
    }
}

class SingletonDemo02Test{
    public static void main(String[] args) {
        SingletonDemo02 instance = SingletonDemo02.getInstance();
        SingletonDemo02 instance2 = SingletonDemo02.getInstance();

        System.out.println(instance==instance2);//true
    }
}
