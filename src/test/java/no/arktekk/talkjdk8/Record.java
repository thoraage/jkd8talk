package no.arktekk.talkjdk8;

public class Record {
    private final String name;

    public Record(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean hasLongName() {
        return name.trim().contains(" ");
    }
}
