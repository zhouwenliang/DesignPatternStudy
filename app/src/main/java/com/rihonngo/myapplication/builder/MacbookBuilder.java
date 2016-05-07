package com.rihonngo.myapplication.builder;

/**
 * Created by Administrator on 2016/5/7.
 */
public class MacbookBuilder extends Builder {
    private Computer mComputer = new Macbook();
    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOs();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
