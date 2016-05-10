package com.rihonngo.myapplication.state;

/**
 * Created by Administrator on 2016/5/10.
 */
public class Client {
    public static void main(String[] args){
        TvController tvController = new TvController();
        tvController.nextChannel();
        tvController.turnUp();
        tvController.powerOff();
        //不会生效
        tvController.turnUp();
    }
}
