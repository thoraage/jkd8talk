package no.arktekk.talkjdk8;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Stream2FlatMapFilterTest {

    @Test
    public void test() {
        List<Artist> artists = asList(
                new Artist("Pink Floyd", asList(new Record("Ummagumma"), new Record("The Dark Side of The Moon"))),
                new Artist("Beck", asList(new Record("Mellow Gold"), new Record("Mutations"), new Record("Midnite Vultures"))));

        Stream<Record> recordStream = artists.stream().flatMap((Artist a) -> a.getRecords().stream());
        Stream<String> nameStream = recordStream.map(Record::getName);
        List<String> records = nameStream.collect(Collectors.<String>toList());

        assertEquals(asList("Ummagumma", "The Dark Side of The Moon", "Mellow Gold", "Mutations", "Midnite Vultures"), records);

        recordStream = artists.stream().flatMap((Artist a) -> a.getRecords().stream());
        Stream<String> filteredNameStream = recordStream.filter((Record r) -> !r.hasLongName()).map(Record::getName);
        List<String> shortRecords = filteredNameStream.collect(Collectors.<String>toList());

        assertEquals(asList("Ummagumma", "Mutations"), shortRecords);
    }

    static class Artist {
        private final String name;
        private final List<Record> records;

        public Artist(String name, List<Record> records) {
            this.name = name;
            this.records = records;
        }

        public String getName() {
            return name;
        }

        public List<Record> getRecords() {
            return records;
        }
    }

    static class Record {
        private final String name;

        public Record(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean hasLongName() {
            return name.trim().contains(" ");
        }
    }

}
