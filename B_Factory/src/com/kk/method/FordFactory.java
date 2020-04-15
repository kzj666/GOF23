package com.kk.method;

import com.kk.simple.Tesla;

/*
@author kzj
@date 2020/4/15 - 11:10
*/

public class FordFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Ford();
    }
}
