package no.arktekk.talkjdk8;

import java.util.Optional;

public class OptionalDemo {

    public static Optional<Integer> getCount() {
        return Optional.of(3);
    }

    public static void main(String[] args) {
        for (int i = 0; i < getCount().orElse(5); ++i) {
            System.out.println("Hurra");
        }
    }

}
