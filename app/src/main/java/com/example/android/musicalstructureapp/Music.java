package com.example.android.musicalstructureapp;

public class Music {
    private String mTitle;

    private String mArtist;


    public Music(String titleName, String artistName) {
        mTitle = titleName;
        mArtist = artistName;
    }

    public String gettitleName() {
        return mTitle;
    }


    public String getartistName() {
        return mArtist;
    }

}