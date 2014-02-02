package copy;

import com.google.common.base.Optional;

import java.util.UUID;

public class Field<T> {

    private final UUID identity;
    private final Optional<T> value;

    public Field() {
        this(UUID.randomUUID(), Optional.<T>absent());
    }

    public Field(UUID identity, Optional<T> value) {
        this.identity = identity;

        this.value = value;
    }

    public static <T> T get(Field<T> fieldReference, Field<?>[] fields, T currentValue) {
        for (Field<?> field : fields) {
            if (field.isSameAs(fieldReference)) {
                return ((Field<T>) field).get();
            }
        }
        return currentValue;
    }

    public T get() {
        return value.get();
    }

    public <T> boolean isSameAs(Field<T> fieldReference) {
        return identity.equals(fieldReference.identity);
    }

    public Field<T> as(T value) {
        return new Field<>(identity, Optional.of(value));
    }
}