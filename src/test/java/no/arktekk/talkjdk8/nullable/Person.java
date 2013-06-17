package no.arktekk.talkjdk8.nullable;

import javax.annotation.Nullable;

public class Person {
    private final Address address;

    public Person(@Nullable Address address) {
        this.address = address;
    }

    @Nullable
    public Address getAddress() {
        return address;
    }
}
