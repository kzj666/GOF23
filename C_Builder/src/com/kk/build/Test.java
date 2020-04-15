package com.kk.build;

/*
@author kzj
@date 2020/4/15 - 14:10
*/


public class Test {
    public static void main(String[] args) {

        //指挥者
        Director director = new Director();
        //指挥具体的工人完成产品
        Product product = director.build(new Worker());
        System.out.println(product.toString());

    }
}
