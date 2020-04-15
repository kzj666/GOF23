package com.kk.abstract1;

/*
@author kzj
@date 2020/4/15 - 12:24
*/
// 小米产品族
public class MiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new MiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new MiRouter();
    }
}
