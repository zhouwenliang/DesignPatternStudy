package com.rihonngo.myapplication.iterater;

/**
 * Created by Administrator on 2016/5/11.
 */
public class Client {
    public static void main(String[] args){
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler1();
        AbstractHandler handler3 = new Handler1();

        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request1("Request2");
        AbstractRequest request3 = new Request1("Request3");

        handler1.handle(request1);
        handler1.handle(request2);
        handler1.handle(request3);
    }
}
