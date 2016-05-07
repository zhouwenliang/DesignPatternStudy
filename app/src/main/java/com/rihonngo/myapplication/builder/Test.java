package com.rihonngo.myapplication.builder;

/**
 * Created by Administrator on 2016/5/7.
 */
public class Test {
    public static void main(String[] args){
        Builder builder = new MacbookBuilder();
        Director director = new Director(builder);
        director.construct("因特尔主板", "Retina显示器");
        System.out.println("Computer Info : " + builder.create().toString());
    }
}
