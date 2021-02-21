package com.tetras;

public class RequetteHttp implements Affichable {

    private Body body;
    private Header header;
    private Url url;

    public RequetteHttp(String url, String body, Header header) {
        this.url = new Url(url);
        this.body = new Body(body);
        this.header = header;
    }

    @Override
    public String afficher() {
        String result = "";
        if (url != null)
            result += url.afficher() + System.lineSeparator();
        if (header != null)
            result += header.afficher() + System.lineSeparator();
        if (body != null)
            result += body.afficher() + System.lineSeparator();
        return result;
    }

    public String getUrl() {
        return url.afficher();
    }

}