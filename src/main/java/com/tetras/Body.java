package com.tetras;

public class Body implements IAffichable {
    private String body = "";

    public Body(String body) {
        this.body = body;
    }

    @Override
    public String afficher() {
        return body;
    }

}