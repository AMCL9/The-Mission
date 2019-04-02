package com.example.firstchurchofgodapplication.devotionalmodel;

public class Stream {

    private String offsetInMilliseconds;
    private String url;
    private String token;

    public String getOffsetInMilliseconds() {
        return offsetInMilliseconds;
    }

    public void setOffsetInMilliseconds(String offsetInMilliseconds) {
        this.offsetInMilliseconds = offsetInMilliseconds;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}


