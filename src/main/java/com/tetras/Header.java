package com.tetras;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Header implements IAffichable {

    Map<String, String> headers = new HashMap<>();

    @Override
    public String afficher() {
        String result = headers.keySet().stream().map(key -> key + "=" + headers.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        return result;
    }

    public void ajouterHeader(String cle, String valeur) {
        headers.put(cle, valeur);
    }

}