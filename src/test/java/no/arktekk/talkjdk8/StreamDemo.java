package no.arktekk.talkjdk8;

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Streams;

public class StreamDemo {

    static public void main(String[] args) {
        ToIntFunction<Integer> sqr = n -> n * n;
        IntStream many = Streams
                .iterate(1, n -> n + 1)
                .map(sqr).limit(25000);
        many.forEach(n -> System.out.print(n + ", "));
    }

}
