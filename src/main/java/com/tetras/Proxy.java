package com.tetras;

public class Proxy extends ServeurWeb {
    public int repondre(RequetteHttp requete) {
        String urlInterdite = "/evilurl" + System.lineSeparator();
        if (requete != null && requete.getUrl() != null && urlInterdite.equals(requete.getUrl())) {
            return 403;
        }
        return super.repondre(requete);
    }
}