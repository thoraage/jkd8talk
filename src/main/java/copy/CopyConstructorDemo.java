package copy;

import static copy.Person.Field.SUR_NAME;

public class CopyConstructorDemo {
    public static void main(String[] args) {
        //System.out.println(new Person("Eldby", "Thor Åge").copy(set(SUR_NAME, "Birkeli")));
    }

    public static <T, F extends Enum<?> & Marker<P>, P> Getter<T, F, P> set(F f, T t) {
        return new Getter<>(f, (P p) -> t);
    }
}

