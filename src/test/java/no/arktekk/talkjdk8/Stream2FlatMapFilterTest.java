package no.arktekk.talkjdk8;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Stream2FlatMapFilterTest {
    private static final List<Artist> ARTISTS = asList(
            new Artist("Pink Floyd", asList(new Record("Ummagumma"), new Record("The Dark Side of The Moon"))),
            new Artist("Beck", asList(new Record("Mellow Gold"), new Record("Mutations"), new Record("Midnite Vultures"))));

    @Test
    public void listNames() {
        Stream<Record> recordStream = ARTISTS.stream().flatMap((Artist a) -> a.getjRecords().stream());
        Stream<String> nameStream = recordStream.map(Record::getName);
        List<String> records = nameStream.collect(Collectors.<String>toList());

        assertEquals(asList("Ummagumma", "The Dark Side of The Moon", "Mellow Gold", "Mutations", "Midnite Vultures"), records);
    }

    @Test
    public void listShortNames() {
        Stream<Record> recordStream = ARTISTS.stream().flatMap((Artist a) -> a.getjRecords().stream());
        Stream<String> filteredNameStream = recordStream.filter((Record r) -> !r.hasLongName()).map(Record::getName);
        List<String> records = filteredNameStream.collect(Collectors.<String>toList());

        assertEquals(asList("Ummagumma", "Mutations"), records);
    }

}
