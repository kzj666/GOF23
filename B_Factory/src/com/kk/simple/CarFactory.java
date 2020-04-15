package com.kk.simple;

/*
@author kzj
@date 2020/4/15 - 11:10
*/
// 普通工厂原则（静态工厂模式）
// 如果增加新产品，无法在不修改原有代码的前提下实现（不符合开闭原则）
public class CarFactory {
    // 方法一
    public static Car getCar(String car){
        if(car.equals("福特")){
            return new Ford();
        }else if (car.equals("特斯拉")){
            return new Tesla();
        }else {
            return null;
        }
    }

    // 方法二
    public static Car getFord(){
        return new Ford();
    }
    public static Car getTesla(){
        return new Tesla();
    }

}
