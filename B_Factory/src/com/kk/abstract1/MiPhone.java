package com.kk.abstract1;

/*
@author kzj
@date 2020/4/15 - 12:16
*/
//小米手机
public class MiPhone implements IphoneProduct {

    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机通话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发短信");
    }
}
