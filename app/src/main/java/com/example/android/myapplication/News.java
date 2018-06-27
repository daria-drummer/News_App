package com.example.android.myapplication;

/**
 * An {@link News} object contains information related to a single news article.
 */


public class News {

    private String mSectionName;

    private String mDate;

    private String mTitle;

    private String mAuthor;

    private String mUrl;

    public News(String sectionName, String date, String title, String author, String url) {
        mSectionName = sectionName;
        mDate = date;
        mTitle = title;
        mUrl = url;
        mAuthor = author;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getDate() {
        return mDate;
    }

    public String getTitle() {
        return mTitle;
    }
    public String getAuthor () {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }
}

