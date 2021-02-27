package com.tetras;

public class ServeurWeb implements IServeurWeb {

    public int repondre(RequetteHttp requete) {
        if (requete == null) {
            return 500;
        }
        return 200;
    }

}