package no.arktekk.talkjdk8;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import no.arktekk.talkjdk8.data.Artist;
import no.arktekk.talkjdk8.data.Record;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Guava2FlatMapFilterTest {
    private static final List<Artist> ARTISTS = asList(
            new Artist("Pink Floyd", asList(new Record("Ummagumma"), new Record("The Dark Side of The Moon"))),
            new Artist("Beck", asList(new Record("Mellow Gold"), new Record("Mutations"), new Record("Midnite Vultures"))));

    @Test
    public void listNames() {
        ImmutableList<String> records = FluentIterable.from(ARTISTS).transformAndConcat(Artist::getRecords).transform(Record::getName).toList();

        assertEquals(asList("Ummagumma", "The Dark Side of The Moon", "Mellow Gold", "Mutations", "Midnite Vultures"), records);
    }

    @Test
    public void listShortNames() {
        FluentIterable<Record> fluentRecords = FluentIterable.from(ARTISTS).transformAndConcat(Artist::getRecords);
        ImmutableList<String> records = fluentRecords.filter((Record r) -> !r.hasLongName()).transform(Record::getName).toList();

        assertEquals(asList("Ummagumma", "Mutations"), records);
    }

}
