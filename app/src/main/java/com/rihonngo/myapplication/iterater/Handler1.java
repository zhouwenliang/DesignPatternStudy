package com.rihonngo.myapplication.iterater;

/**
 * Created by Administrator on 2016/5/11.
 */
public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1 handle request:" + request.getRequestLevel());
    }
}
