package com.tetras;

public class ServeurWebProxy implements IServeurWeb {

    private ServeurWeb serveurWeb = new ServeurWeb();

    public int repondre(RequetteHttp requete) {
        String urlInterdite = "/evilurl";
        if (requete != null && requete.getUrl() != null && requete.getUrl().contains(urlInterdite)) {
            return 403;
        }
        return serveurWeb.repondre(requete);
    }
}