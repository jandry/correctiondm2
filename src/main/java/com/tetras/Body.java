package com.tetras;

public class Body implements Affichable {
    private String body = "";

    public Body(String body) {
        this.body = body;
    }

    @Override
    public String afficher() {
        return body;
    }

}