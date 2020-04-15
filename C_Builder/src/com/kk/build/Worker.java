package com.kk.build;

/*
@author kzj
@date 2020/4/15 - 14:02
*/
// 具体建造者：工人
public class Worker extends Builder{

    private Product product;

    //工人负责创建产品
    public Worker () {
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("A组件");
        System.out.println("A组件");
    }

    @Override
    void buildB() {
        product.setBuildB("B组件");
        System.out.println("B组件");
    }

    @Override
    void buildC() {
        product.setBuildC("C组件");
        System.out.println("C组件");
    }

    @Override
    void buildD() {
        product.setBuildD("D组件");
        System.out.println("D组件");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
