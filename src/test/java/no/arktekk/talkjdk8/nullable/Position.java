package no.arktekk.talkjdk8.nullable;

import javax.annotation.Nullable;
import java.util.Optional;

public class Position {
    @Nullable
    private final Person employee;
    private final Person employer;

    public Position(@Nullable Person employee, Person employer) {
        this.employee = employee;
        this.employer = employer;
    }

    @Nullable
    public Person getEmployee() {
        return employee;
    }

    public Person getEmployer() {
        return employer;
    }
}

