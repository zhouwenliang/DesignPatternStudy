package com.rihonngo.myapplication.factory;

/**
 * Created by Administrator on 2016/5/7.
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
