package com.kk.build;

/*
@author kzj
@date 2020/4/15 - 14:07
*/

//指挥：核心。负责指挥构建一个工程，工程如何构建由指挥决定
public class Director {
    public Product build(Builder builder){
        builder.buildC();
        builder.buildA();
        builder.buildD();
        builder.buildB();
        return builder.getProduct();
    }
}
