package com.rihonngo.myapplication.stragety;

/**
 * Created by Administrator on 2016/5/9.
 */
public class TaxiStragety implements CalculateStragety {
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
