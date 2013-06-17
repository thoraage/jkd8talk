package no.arktekk.talkjdk8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    static public void main(String[] args) {
        IntStream squareStream = Stream
                .iterate(1, n -> n + 1)
                .mapToInt(n -> n * n);
        IntStream many = squareStream.limit(25000);
        many.forEach(n -> System.out.print(n + ", "));
    }

}
