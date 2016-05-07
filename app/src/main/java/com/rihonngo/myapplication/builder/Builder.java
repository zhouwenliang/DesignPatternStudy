package com.rihonngo.myapplication.builder;

/**
 * Created by Administrator on 2016/5/7.
 */
public abstract class Builder {
    public abstract void buildBoard(String board);

    public abstract void buildDisplay(String display);

    public abstract void buildOS();

    public abstract Computer create();

}
