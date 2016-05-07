package com.rihonngo.myapplication.builder;

/**
 * Created by Administrator on 2016/5/7.
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOs;

    protected  Computer(){}

    public void setBoard(String board){
        mBoard = board;
    }

    public void setDisplay(String display){
        mDisplay = display;
    }

    public abstract void setOs();

    public String toString(){
        return "Computer [mBoard=" + mBoard  + ",mDisplay=" + mDisplay + ",mOs=" + mOs + "]";
    }
}
