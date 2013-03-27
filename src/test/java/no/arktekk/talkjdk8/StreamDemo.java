package no.arktekk.talkjdk8;

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Streams;

import static no.arktekk.talkjdk8.util.Timers.time;

public class StreamDemo {

    static public void main(String[] args) {
        ToIntFunction<Integer> sqr = n -> n * n;
        IntStream sqrStream = Streams
                .iterate(1, n -> n + 1)
                .map(sqr);
        IntStream many = time(() -> sqrStream.limit(25000));
        many.forEach(n -> System.out.print(n + ", "));
    }

}
