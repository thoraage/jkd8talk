package no.arktekk.talkjdk8.data;

import java.util.List;

import static java.util.Arrays.asList;

public class Artist {
    public static final List<Artist> ARTISTS = asList(
            new Artist("Pink Floyd", asList(
                    new Record("Ummagumma"), new Record("The Dark Side of The Moon"))),
            new Artist("Beck", asList(
                    new Record("Mellow Gold"), new Record("Mutations"), new Record("Midnite Vultures"))));

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

    public List<Record> getRecords() {
        return jRecords;
    }

    public fj.data.List<Record> getFjRecords() {
        return fjRecords;
    }
}
