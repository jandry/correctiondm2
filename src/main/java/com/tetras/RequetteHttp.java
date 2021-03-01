package com.tetras;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RequetteHttp implements IAffichable {

    List<IAffichable> list = new ArrayList<>();

    public RequetteHttp(String url, String body, Header header) {
        ajouter(new Url(url));
        ajouter(header);
        ajouter(new Body(body));
    }

    @Override
    public String afficher() {
        String result = list.stream().map(IAffichable::afficher).collect(Collectors.joining(System.lineSeparator()));
        return result;
    }

    public String getUrl() {
        String result = "";
        if (list.get(0) != null && list.get(0) instanceof Url) {
            result = list.get(0).afficher();
        }
        return result;
    }

    public void ajouter(IAffichable elementRequete) {
        if (elementRequete instanceof Url) {
            list.add(0, elementRequete);
        } else if (elementRequete instanceof Header) {
            list.add(1, elementRequete);
        } else if (elementRequete instanceof Body) {
            list.add(2, elementRequete);
        } else {
            throw new IllegalArgumentException();
        }
    }

}