package copy;

import static copy.Person.Field.FORE_NAME;
import static copy.Person.Field.SUR_NAME;

public class Person {
    public static enum Field {
        SUR_NAME, FORE_NAME
    }

    private final String surName;
    private final String foreName;

    public Person copy(Getter... getters) {
        return null; //new Person(get(SUR_NAME, surName, getters), get(FORE_NAME, foreName, getters));
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
