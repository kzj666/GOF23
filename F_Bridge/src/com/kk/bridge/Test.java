package com.kk.bridge;

/*
@author kzj
@date 2020/4/15 - 21:12
*/

public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Computer computer = new Laptop(new Apple());
        computer.info();
        //联想台式机
        Computer computer2 = new Desktop(new Lenovo());
        computer2.info();
    }
}
