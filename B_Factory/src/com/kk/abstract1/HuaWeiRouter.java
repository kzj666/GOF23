package com.kk.abstract1;

/*
@author kzj
@date 2020/4/15 - 12:19
*/
//华为路由器
public class HuaWeiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");

    }

    @Override
    public void openWifi() {
        System.out.println("打开华为路由器");

    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置");

    }
}
