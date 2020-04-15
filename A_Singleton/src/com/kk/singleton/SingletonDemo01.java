package com.kk.singleton;

/*
@author kzj
@date 2020/1/21 - 18:34
*/

//饿汉式单例
public class SingletonDemo01 {
    //1.私有化构造器
    private SingletonDemo01(){

    }
    //2.类初始化的时候，立即加载该对象
    private static SingletonDemo01 instance = new SingletonDemo01();

    //3.提供获取该对象的方法，没有synchronize，效率高！
    public static SingletonDemo01 getInstance(){
        return instance;
    }
}

class SingletonDemo01Test{
    public static void main(String[] args) {
        SingletonDemo01 instance = SingletonDemo01.getInstance();
        SingletonDemo01 instance2 = SingletonDemo01.getInstance();

        System.out.println(instance==instance2);//true
    }
}
