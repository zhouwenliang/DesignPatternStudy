package com.rihonngo.myapplication.iterater;

/**
 * Created by Administrator on 2016/5/11.
 */
public class Request1 extends AbstractRequest {

    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
