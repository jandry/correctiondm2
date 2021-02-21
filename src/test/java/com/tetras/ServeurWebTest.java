package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ServeurWebTest {

    private ServeurWeb serveur = new Proxy();

    @Test
    public void test500() {
        RequetteHttp requete = null;
        assertEquals(500, serveur.repondre(requete));

    }

    @Test
    public void test200() {
        RequetteHttp requete = new RequetteHttp("/", "body", new Header());
        assertEquals(200, serveur.repondre(requete));

    }

    @Test
    public void test403() {
        RequetteHttp requete = new RequetteHttp("/evilurl", "body", new Header());
        assertEquals(403, serveur.repondre(requete));

    }

    @Test
    public void testAfficherRequeteVide() {
        RequetteHttp requete = new RequetteHttp("", "", new Header());
        assertEquals(System.lineSeparator() + "{}" + System.lineSeparator() + System.lineSeparator(),
                requete.afficher());

    }

    @Test
    public void testAfficherRequete() {
        Header header = new Header();
        header.ajouterHeader("cle", "valeur");
        RequetteHttp requete = new RequetteHttp("/url", "body", header);
        //
        assertEquals("/url" + System.lineSeparator() + "{cle=valeur}" + System.lineSeparator() + "body"
                + System.lineSeparator(), requete.afficher());

    }
}