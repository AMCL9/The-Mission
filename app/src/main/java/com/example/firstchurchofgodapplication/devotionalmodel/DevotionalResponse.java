package com.example.firstchurchofgodapplication.devotionalmodel;

import java.util.List;

public class DevotionalResponse {

    private String type;

    private String title;

    private String excerpt;

    private Items[] items;

    private String url;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ClassPojo [type = " + type + ", title = " + title + ", excerpt = " + excerpt + ", items = " + items + ", url = " + url + "]";
    }
}
