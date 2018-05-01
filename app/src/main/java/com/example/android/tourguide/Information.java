package com.example.android.tourguide;

public class Information {

    private String mTitle ;
    private String mSubTitle ;
    private String mInfo ;
    private int mImageResourceId ;

    public Information(String Title , String SubTitle , String Info , int ImageResourceId){
        mTitle = Title;
        mSubTitle = SubTitle;
        mInfo = Info;
        mImageResourceId = ImageResourceId;
    }
    public Information(String Title , String SubTitle , int ImageResourceId){
        mTitle = Title;
        mSubTitle = SubTitle;
        mImageResourceId = ImageResourceId;
    }
    public String getmTitle() {
        return mTitle;
    }

    public String getmSubTitle() {
        return mSubTitle;
    }

    public String getmInfo() {
        return mInfo;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasText() {
        return mInfo != null;
    }
}


