import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

    private List<String> list = Arrays.asList("hei", "hopp", "bare", "topp");

    @Test
    public void reduce() {
        System.out.println(list.stream().reduce("", (s1, s2) -> s1 + s2));
    }

    @Test
    public void reduce_notFoldButMapReduce() {
        System.out.println(list.stream().reduce(0, (n, s) -> n + s.length(), (n1, n2) -> n1 + n2));
    }

}
