package com.rihonngo.myapplication.singleton;

/**
 * Created by Administrator on 2016/5/7.
 */
public class Singleton3 {
    private Singleton3() {
    }

    public static Singleton3 getInstance(){
        return  SingletonHolder.sInstance;
    }

    private static class SingletonHolder{
        private static Singleton3 sInstance = new Singleton3();
    }
}
