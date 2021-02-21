package com.tetras;

public class Url implements Affichable {

    private String url = "/";

    public Url(String url) {
        this.url = url;
    }

    @Override
    public String afficher() {
        return url;
    }

}