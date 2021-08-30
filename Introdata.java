package com.example.a726version;

import android.content.res.Resources;

import androidx.core.graphics.drawable.IconCompat;

public class Introdata {
    private String name;
    private int imageResourceId;
    private int videoResourceId;
    private String introtext;



   
    public static final Introdata[] introdata={
     new Introdata("智能娃娃",R.drawable.babypic,R.raw.baby,"智能娃娃的介绍内容"),
            new Introdata("智能药盒",R.drawable.madine,R.raw.madinebox,"智能药盒的介绍内容"),
            new Introdata("智能脉诊仪",R.drawable.checker,R.raw.checkerheartbit,"智能脉诊仪的介绍内容")


};

    public Introdata(String name, int imageResourceId, int videoResourceId,String introtext) {
        this.name=name;
        this.imageResourceId=imageResourceId;
       this.videoResourceId=videoResourceId;
       this.introtext=introtext;

    }

    public Introdata(String name, int imageResourceId, int videoResourceId, int introtext) {
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    public int getVideoResourceId() { return videoResourceId; }

    public String getIntrotext(){
        return introtext;
    }


}
