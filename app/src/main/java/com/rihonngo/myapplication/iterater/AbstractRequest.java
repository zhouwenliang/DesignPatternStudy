package com.rihonngo.myapplication.iterater;

/**
 * Created by Administrator on 2016/5/11.
 */
public abstract class AbstractRequest {
    private Object obj;

    public AbstractRequest(Object obj){
        this.obj = obj;
    }

    public Object getContent(){
        return obj;
    }

    public abstract int getRequestLevel();
}
