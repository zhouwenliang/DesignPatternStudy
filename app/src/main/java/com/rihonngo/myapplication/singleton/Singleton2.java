package com.rihonngo.myapplication.singleton;

/**
 * Created by Administrator on 2016/5/7.
 */
public class Singleton2 {
    private static Singleton2 sInstance;
    private Singleton2(){

    }
    public void doSomething(){
        System.out.println("do something");
    }

    public static Singleton2 getmInstance(){
        if(sInstance == null){
            synchronized (Singleton2.class){
                if(sInstance == null){
                    sInstance = new Singleton2();
                }
            }
        }
        return  sInstance;
    }
}
