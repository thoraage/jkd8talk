import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Streams;

public class StreamTest {

    private List<String> list = Arrays.asList("hei", "hopp", "bare", "topp");

    @Test
    public void zip_everyOther() {
        Stream<Integer> numbers = Stream.iterate(1, n -> n + 1);
        Streams.zip(numbers, list.stream(), (n, s) -> n + " " + s).forEach(System.out::println);
    }

    @Test
    public void reduce() {
        System.out.println(list.stream().reduce("", (s1, s2) -> s1 + s2));
    }

    @Test
    public void reduce_notFoldButMapReduce() {
        System.out.println(list.stream().reduce(0, (n, s) -> n + s.length(), (n1, n2) -> n1 + n2));
    }

}
