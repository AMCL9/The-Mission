package com.example.firstchurchofgodapplication.devotionalmodel;

public class Items {

    private String image;

    private boolean has_audio;

    private boolean has_text;

    private String subtitle;

    private String image_mq;

    private String type;

    private String title;

    private String excerpt;

    private String url;

    private String slug;

    private boolean has_video;

    public Items(String image, boolean has_audio, boolean has_text, String subtitle, String image_mq, String type, String title, String excerpt, String url, String slug, boolean has_video) {
        this.image = image;
        this.has_audio = has_audio;
        this.has_text = has_text;
        this.subtitle = subtitle;
        this.image_mq = image_mq;
        this.type = type;
        this.title = title;
        this.excerpt = excerpt;
        this.url = url;
        this.slug = slug;
        this.has_video = has_video;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean getHas_audio() {
        return has_audio;
    }

    public void setHas_audio(boolean has_audio) {
        this.has_audio = has_audio;
    }

    public boolean  getHas_text() {
        return has_text;
    }

    public void setHas_text(boolean has_text) {
        this.has_text = has_text;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImage_mq() {
        return image_mq;
    }

    public void setImage_mq(String image_mq) {
        this.image_mq = image_mq;
    }

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean getHas_video() {
        return has_video;
    }

    public void setHas_video(boolean  has_video) {
        this.has_video = has_video;
    }

    @Override
    public String toString() {
        return "ClassPojo [image = " + image + ", has_audio = " + has_audio + ", has_text = " + has_text + ", subtitle = " + subtitle + ", image_mq = " + image_mq + ", type = " + type + ", title = " + title + ", excerpt = " + excerpt + ", url = " + url + ", slug = " + slug + ", has_video = " + has_video + "]";
    }
}



