import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Streams;

public class StreamExample {

    static public void main(String[] args) {
        ToIntFunction<Integer> f = n -> n * n;
        IntStream squares = Streams.iterate(1, n -> n + 1).map(f);
        IntStream many = Timers.time(() -> squares.limit(25000));
        many.forEach(n -> System.out.print(n + ", "));
    }

}
