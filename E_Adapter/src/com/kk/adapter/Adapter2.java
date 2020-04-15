package com.kk.adapter;

/*
@author kzj
@date 2020/4/15 - 18:38
*/

//组合（对象适配器，常用）——就是
//真正的适配器，需要连接USB，连接网线
public class Adapter2 implements NetToUsb {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        //继承网线，super实现上网
        adaptee.request();
    }
}
