package no.arktekk.talkjdk8.util;

import java.util.function.Supplier;

public abstract class Timers {

    public static <R> R time(Supplier<R> f) {
        long start = System.currentTimeMillis();
        R r = f.get();
        System.out.println("Time: " + (System.currentTimeMillis() - start));
        return r;
    }

    public static void time(Effect f) {
        long start = System.currentTimeMillis();
        f.apply();
        System.out.println("Time: " + (System.currentTimeMillis() - start));
    }

    public static interface Effect {
        void apply();
    }
}
