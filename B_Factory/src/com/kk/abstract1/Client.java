package com.kk.abstract1;

/*
@author kzj
@date 2020/4/15 - 12:28
*/

public class Client {
    public static void main(String[] args) {
        System.out.println("=================================小米系列产品==================================");
        MiFactory miFactory = new MiFactory();
        IphoneProduct iphoneProduct = miFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IRouterProduct iRouterProduct = miFactory.iRouterProduct();
        iRouterProduct.openWifi();

        System.out.println("=================================华为系列产品==================================");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IphoneProduct iphoneProduct1 = huaWeiFactory.iphoneProduct();
        iphoneProduct1.callup();
        iphoneProduct1.sendSMS();

        IRouterProduct iRouterProduct1 = huaWeiFactory.iRouterProduct();
        iRouterProduct1.openWifi();
    }
}
