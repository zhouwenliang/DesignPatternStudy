package com.rihonngo.myapplication.iterater;

/**
 * Created by Administrator on 2016/5/11.
 */
public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler2 handle request:" + request.getRequestLevel());
    }
}
