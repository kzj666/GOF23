package com.kk.abstract1;

/*
@author kzj
@date 2020/4/15 - 12:17
*/
//华为手机
public class HuaWeiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机通话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发短信");
    }
}
