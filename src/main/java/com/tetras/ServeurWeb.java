package com.tetras;

public class ServeurWeb {
    public int repondre(RequetteHttp requete) {
        if (requete == null) {
            return 500;
        }
        return 200;
    }

}