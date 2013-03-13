package no.arktekk.talkjdk8;

import java.util.List;

public class Artist {
    private final String name;
    private final fj.data.List<Record> fjRecords;
    private final List<Record> jRecords;

    public Artist(String name, List<Record> jRecords) {
        this.name = name;
        this.jRecords = jRecords;
        this.fjRecords = null;
    }

    public Artist(String name, fj.data.List<Record> fjRecords) {
        this.name = name;
        this.fjRecords = fjRecords;
        this.jRecords = null;
    }

    public String getName() {
        return name;
    }

    public List<Record> getjRecords() {
        return jRecords;
    }

    public fj.data.List<Record> getFjRecords() {
        return fjRecords;
    }
}
