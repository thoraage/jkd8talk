import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Hest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hei", "hopp", "bare", "topp");
        Stream<String> stream = list.stream().map(s -> s + "sann");
        Consumer<? super String> println = System.out::println;
        stream.forEach(println);
        Supplier<String> s = () -> "hei";
        System.out.println(s.get());
    }

}
