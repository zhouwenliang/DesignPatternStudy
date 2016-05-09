package com.rihonngo.myapplication.stragety;

/**
 * Created by Administrator on 2016/5/9.
 */
public class BusStrategy implements CalculateStragety {
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int prince = 1 + extraFactor * 1;
        return fraction > 0 ? ++prince : prince;
    }
}
