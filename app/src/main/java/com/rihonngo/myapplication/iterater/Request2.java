package com.rihonngo.myapplication.iterater;

/**
 * Created by Administrator on 2016/5/11.
 */
public class Request2 extends AbstractRequest {

    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
