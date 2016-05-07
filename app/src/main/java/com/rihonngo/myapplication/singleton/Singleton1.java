package com.rihonngo.myapplication.singleton;

/**
 * Created by Administrator on 2016/5/7.
 */
public class Singleton1 {
    private static Singleton1 sInstance;

    private Singleton1() {

    }

    public void doSomething(){
        System.out.println("do something");
    }

    public static Singleton1 getInstance(){
        if(sInstance == null){
            sInstance = new Singleton1();
        }
        return sInstance;
    }
}
