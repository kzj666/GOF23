package com.kk.adapter;

/*
@author kzj
@date 2020/4/15 - 18:35
*/
//客户端类，想上网，插不上网线
public class Computer {

    public void net(NetToUsb adapter){
        //上网的具体实现，找一个网线转接头
        adapter.handleRequest();
    }

    //测试
    public static void main(String[] args) {
        //电脑
        Computer computer = new Computer();
        //网线
        Adaptee adaptee = new Adaptee();
        //类适配类型的转接器
//        Adapter adapter = new Adapter();
        //组合类型的对象适配器
        Adapter2 adapter = new Adapter2(adaptee);


        computer.net(adapter);
    }
}
