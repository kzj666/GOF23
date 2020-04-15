package com.kk.method;

/*
@author kzj
@date 2020/4/15 - 11:10
*/

public class TeslaFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Tesla();
    }
}
