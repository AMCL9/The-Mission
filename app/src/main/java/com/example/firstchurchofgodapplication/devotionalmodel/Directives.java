package com.example.firstchurchofgodapplication.devotionalmodel;

class Directives {
    private AudioItem audioItem;
    private String  type;
    private String playBehavior;

    public Directives(AudioItem audioItem, String type, String playBehavior) {
        this.audioItem = audioItem;
        this.type = type;
        this.playBehavior = playBehavior;
    }

    public AudioItem getAudioItem() {
        return audioItem;
    }

    public String getType() {
        return type;
    }

    public String getPlayBehavior() {
        return playBehavior;
    }

    public void setAudioItem(AudioItem audioItem) {
        this.audioItem = audioItem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlayBehavior(String playBehavior) {
        this.playBehavior = playBehavior;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

