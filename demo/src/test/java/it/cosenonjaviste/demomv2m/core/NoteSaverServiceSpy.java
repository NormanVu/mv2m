package it.cosenonjaviste.demomv2m.core;

import it.cosenonjaviste.demomv2m.model.NoteSaverService;
import retrofit.client.Response;

public class NoteSaverServiceSpy implements NoteSaverService {

    public long id;
    public String title;
    public String text;

    @Override public Response save(long id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
        return null;
    }
}