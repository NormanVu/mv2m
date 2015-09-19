package it.cosenonjaviste.demomv2m.core;

import it.cosenonjaviste.demomv2m.model.Note;
import it.cosenonjaviste.demomv2m.model.NoteListResponse;
import it.cosenonjaviste.demomv2m.model.NoteLoaderService;

public class NoteLoaderServiceStub implements NoteLoaderService {
    private Note note;

    public NoteLoaderServiceStub(Note note) {
        this.note = note;
    }

    @Override public Note load(String objectId) {
        return note;
    }

    @Override public NoteListResponse loadItems() {
        return null;
    }
}
