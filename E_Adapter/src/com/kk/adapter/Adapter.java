package com.kk.adapter;

/*
@author kzj
@date 2020/4/15 - 18:38
*/
//继承（类适配器，单继承）,比较局限
//真正的适配器，需要连接USB，连接网线
public class Adapter extends Adaptee implements NetToUsb {
    @Override
    public void handleRequest() {
        //继承网线，super实现上网
        super.request();
    }
}
