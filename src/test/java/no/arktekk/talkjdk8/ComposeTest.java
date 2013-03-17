package no.arktekk.talkjdk8;

import org.junit.Test;

import java.util.List;
import java.util.function.Function;
import java.util.function.Functions;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class ComposeTest {

    @Test
    public void test() {
        List<String> words = asList("it was the best of times it was the worst of times".split(" "));
        Function<String, Integer> length = String::length;
        Function<Integer, String> toString = n -> Integer.toString(n);
        Function<String, String> compose = Functions.chain(length, toString);
        List<String> lengths = words.stream().map(compose).collect(Collectors.<String>toList());

        List<String> facit = asList("2", "3", "3", "4", "2", "5", "2", "3", "3", "5", "2", "5");
        assertEquals(facit, lengths);
    }

}
