package copy;

import java.util.Map;
import java.util.function.Function;

public class Getter<T, F extends Enum<?>, P> {
    public final F field;


    public Getter(F field, Function<P, T> function) {
        this.field = field;
    }

    @SuppressWarnings("unchecked")
    public <F extends Enum<?>, T> T get(F field, T defaultValue) {
        /*T v = (T) map.get(field);
        if (v == null) {
            return defaultValue;
        }
        return v;*/
        return null;
    }

}
