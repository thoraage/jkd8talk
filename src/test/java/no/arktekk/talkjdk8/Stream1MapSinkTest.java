package no.arktekk.talkjdk8;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Stream1MapSinkTest {

    @Test
    public void test() {
        List<String> names = asList("Tom Waits", "Johnny Cash", "Stefan Sundström");

        List<String> foreNames = null;

        assertEquals(asList("Tom", "Johnny", "Stefan"), foreNames);
    }

}
