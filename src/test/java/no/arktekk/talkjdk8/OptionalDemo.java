package no.arktekk.talkjdk8;

import javax.annotation.Nullable;

public class OptionalDemo {

    @Nullable
    public static Integer getCount() {
        return 3;
    }

    public static void main(String[] args) {
        for (int i = 0; i < getCount(); ++i) {
            System.out.println("Hurra");
        }
    }

}
