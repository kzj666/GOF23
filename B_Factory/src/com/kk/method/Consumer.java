package com.kk.method;

/*
@author kzj
@date 2020/4/15 - 11:07
*/

import com.kk.simple.Ford;
import com.kk.simple.Tesla;

public class Consumer {
    public static void main(String[] args) {
        Car tesla = new TeslaFactory().getCar();
        tesla.name();
        Car ferrari = new FerrariFactory().getCar();
        ferrari.name();
    }
}
