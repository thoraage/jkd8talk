package no.arktekk.talkjdk8.optional;

import java.util.Optional;

public class Position {
    private final Optional<Person> employee;
    private final Person employer;

    public Position(Optional<Person> employee, Person employer) {
        this.employee = employee;
        this.employer = employer;
    }

    public Optional<Person> getEmployee() {
        return employee;
    }

    public Person getEmployer() {
        return employer;
    }
}

