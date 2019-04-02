package com.example.firstchurchofgodapplication.devotionalmodel;

import java.util.stream.Stream;

class AudioItem {
    private Stream stream;

    public Stream getStream () {
        return stream;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
