package no.arktekk.talkjdk8;

import com.google.common.collect.FluentIterable;
import no.arktekk.talkjdk8.data.Artist;
import no.arktekk.talkjdk8.data.Record;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Guava2FlatMapFilterTest {

    @Test
    public void listNames() {
        List<String> records = null;

        assertEquals(asList("Ummagumma", "The Dark Side of The Moon", "Mellow Gold", "Mutations", "Midnite Vultures"), records);
    }

    @Test
    public void listShortNames() {
        List<String> records = null;

        assertEquals(asList("Ummagumma", "Mutations"), records);
    }

}
