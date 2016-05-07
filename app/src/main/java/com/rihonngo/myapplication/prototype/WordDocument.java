package com.rihonngo.myapplication.prototype;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/5/7.
 */
public class WordDocument implements Cloneable{
    private String mText;
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument(){
        System.out.println("------- WordDocument 构造函数 -------");
    }

    @Override
    protected WordDocument clone(){
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            doc.mImages = this.mImages;
            return doc;
        } catch (Exception e){

        }
        return null;
    }

}
