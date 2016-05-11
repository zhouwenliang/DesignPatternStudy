package com.rihonngo.myapplication.iterater;

/**
 * Created by Administrator on 2016/5/11.
 */
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    protected abstract int getHandlerLevel();

    protected abstract void handle(AbstractRequest request);
}
