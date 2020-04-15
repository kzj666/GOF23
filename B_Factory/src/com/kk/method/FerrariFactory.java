package com.kk.method;

/*
@author kzj
@date 2020/4/15 - 11:42
*/

public class FerrariFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Ferrari();
    }
}
