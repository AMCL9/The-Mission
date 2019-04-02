package com.example.firstchurchofgodapplication.devotionalmodel;

import java.util.List;

public class DevotionalResponse {
    private String shouldEndSession;
    private Reprompt reprompt;
    private List<Directives> directives;
    private String response;
    private String version;
    private Card card;

    public DevotionalResponse(String shouldEndSession, Reprompt reprompt, List<Directives> directives, String response, String version, Card card) {
        this.shouldEndSession = shouldEndSession;
        this.reprompt = reprompt;
        this.directives = directives;
        this.response = response;
        this.version = version;
        this.card = card;
    }

    public String getShouldEndSession() {
        return shouldEndSession;
    }

    public Reprompt getReprompt() {
        return reprompt;
    }

    public List<Directives> getDirectives() {
        return directives;
    }

    public String getResponse() {
        return response;
    }

    public String getVersion() {
        return version;
    }

    public Card getCard() {
        return card;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
