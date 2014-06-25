package no.arktekk.talkjdk8;

import fj.F;
import fj.data.List;
import no.arktekk.talkjdk8.data.Artist;
import no.arktekk.talkjdk8.data.Record;
import org.junit.Test;

import java.util.function.Function;

import static fj.data.List.list;
import static org.junit.Assert.assertEquals;

public class FunctionalJava2FlatMapFilterTest {
    private static final List<Artist> ARTISTS = list(
            new Artist("Pink Floyd", list(new Record("Ummagumma"), new Record("The Dark Side of The Moon"))),
            new Artist("Beck", list(new Record("Mellow Gold"), new Record("Mutations"), new Record("Midnite Vultures"))));

    @Test
    public void listNames() {
        List<String> records = null;

        assertEquals(list("Ummagumma", "The Dark Side of The Moon", "Mellow Gold", "Mutations", "Midnite Vultures"), records);
    }

}
