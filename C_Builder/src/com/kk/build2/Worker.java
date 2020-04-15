package com.kk.build2;

/*
@author kzj
@date 2020/4/15 - 14:36
*/

public class Worker extends Builder {

    private Product product;

    public Worker(){
        product = new Product();
    }


    @Override
    public Builder builderX(String msg) {
        product.setBuildX(msg);
        return this;
    }

    @Override
    public Builder builderY(String msg) {
        product.setBuildY(msg);
        return this;
    }

    @Override
    public Builder builderZ(String msg) {
        product.setBuildZ(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
