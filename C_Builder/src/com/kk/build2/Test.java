package com.kk.build2;

/*
@author kzj
@date 2020/4/15 - 14:49
*/

public class Test {
    public static void main(String[] args) {
        //服务员
        Worker worker = new Worker();
        //链式编程
        //在原来的基础上可以自己定义想要建造的东西
        Product product = worker.builderX("XXXXXXXXXXXXXX")
                .getProduct();
        System.out.println(product.toString());
    }
}
