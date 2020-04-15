package com.kk.simple;

/*
@author kzj
@date 2020/4/15 - 11:07
*/

public class Consumer {
    public static void main(String[] args) {
        Car tesla = new Tesla();
        Car ford = new Ford();

        //使用工厂获得
        Car car = CarFactory.getCar("福特");
        car.name();

    }
}
