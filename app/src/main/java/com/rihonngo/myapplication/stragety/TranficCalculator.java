package com.rihonngo.myapplication.stragety;

/**
 * Created by Administrator on 2016/5/9.
 */
public class TranficCalculator {
    CalculateStragety mCalculateStragety;

    public static void main(String[] args){
        TranficCalculator tranficCalculator = new TranficCalculator();
        tranficCalculator.setStragety(new TaxiStragety());
        tranficCalculator.calculatePrince(16);
    }

    public void setStragety(CalculateStragety stragety){
        this.mCalculateStragety = stragety;
    }

    public int calculatePrince(int km){
        return mCalculateStragety.calculatePrice(km);
    }
}
