package com.kk.abstract1;

/*
@author kzj
@date 2020/4/15 - 12:24
*/

//华为产品族
public class HuaWeiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new HuaWeiRouter();
    }
}
