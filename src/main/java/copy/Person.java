package copy;

import java.util.UUID;

public class Person {
    public static Field<String> SUR_NAME = new Field<>(), FORE_NAME = new Field<>();

    private final String surName;
    private final String foreName;

    public Person copy(Field<?>... fields) {
        return new Person(Field.get(SUR_NAME, fields, surName), Field.get(FORE_NAME, fields, foreName));
    }

    public Person(String surName, String foreName) {
        this.surName = surName;
        this.foreName = foreName;
    }

    public String surName() {
        return surName;
    }

    public String foreName() {
        return foreName;
    }

    @Override
    public String toString() {
        return surName + ", " + foreName;
    }
}
