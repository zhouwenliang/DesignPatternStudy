package com.rihonngo.myapplication.factory;

/**
 * Created by Administrator on 2016/5/7.
 */
public class Client {
    public static void main(String[] args){
        Factory factory = new ConcreteFactory();
        Product p = factory.createProduct();
        p.method();
    }
}
