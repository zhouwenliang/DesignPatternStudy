package com.rihonngo.myapplication.state;

/**
 * Created by Administrator on 2016/5/10.
 */
public class TvController implements PowerController {
    TvState mTvState;

    public void setTvState(TvState tvState){
        this.mTvState = tvState;
    }

    @Override
    public void poweOn() {
        setTvState(new PowerOnState());
        System.out.println("开机了");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机了");
    }

    public void nextChannel(){
        mTvState.nextChannel();
    }

    public void prevChannel(){
        mTvState.nextChannel();
    }

    public void turnUp(){
        mTvState.turnUp();
    }

    public void turnDown(){
        mTvState.turnDown();
    }
}
