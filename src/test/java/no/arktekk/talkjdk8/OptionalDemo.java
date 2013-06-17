package no.arktekk.talkjdk8;

import no.arktekk.talkjdk8.nullable.Address;
import no.arktekk.talkjdk8.nullable.Person;
import no.arktekk.talkjdk8.nullable.Position;
import org.junit.Test;

import javax.annotation.Nullable;

public class OptionalDemo {

    @Nullable
    public static Integer getCount() {
        return 3;
    }

    @Test
    public void optional() {
        for (int i = 0; i < getCount(); ++i) {
            System.out.println("Hurra");
        }
    }















    @Test
    public void flatMap() {
        Position position = new Position(new Person(new Address("4001", "Stavanger")), new Person(null));
        String city = "Oslo";
        Person employee = position.getEmployee();
        if (employee != null) {
            Address address = employee.getAddress();
            if (address != null) {
                city = address.getCity();
            }
        }
        System.out.println(city);
    }

}
