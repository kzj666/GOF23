package com.kk.build;

/*
@author kzj
@date 2020/4/15 - 13:59
*/

//抽象的建造者
public abstract class Builder {
    abstract void buildA();
    abstract void buildB();
    abstract void buildC();
    abstract void buildD();

    //完工，得到产品
    abstract Product getProduct();

}
