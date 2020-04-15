package com.kk.abstract1;

/*
@author kzj
@date 2020/4/15 - 12:23
*/

//抽象产品工厂
//抽象工厂中，有不同产品等级（不同类别）的产品的生产接口
public interface IProductFactory {

    //生产手机
    IphoneProduct iphoneProduct();
    //生产路由器
    IRouterProduct iRouterProduct();

}
