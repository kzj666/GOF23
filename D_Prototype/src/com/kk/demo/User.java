package com.kk.demo;

/*
@author kzj
@date 2020/4/15 - 16:10
*/

import java.util.Date;

public class User implements Cloneable{
    private String name;
    private Date date;

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //改变代码，使其实现深克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        User u = (User)obj;
        u.date = (Date) this.date.clone();
        return obj;
    }

    public User(){
    }
    public User(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
