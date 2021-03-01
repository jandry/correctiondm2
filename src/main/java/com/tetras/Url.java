package com.tetras;

public class Url implements IAffichable {

    private String url = "/";

    public Url(String url) {
        this.url = url;
    }

    @Override
    public String afficher() {
        return url;
    }

}