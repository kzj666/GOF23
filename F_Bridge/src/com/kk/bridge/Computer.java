package com.kk.bridge;

/*
@author kzj
@date 2020/4/15 - 21:07
*/

public abstract class Computer {

    //关键代码
    //将品牌属性组合进Computer类
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }
    public void info(){
        brand.info();
    }
}
class Desktop extends Computer{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}
class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Laptop");
    }
}