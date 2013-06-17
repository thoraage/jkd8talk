package no.arktekk.talkjdk8;

import no.arktekk.talkjdk8.nullable.Address;
import no.arktekk.talkjdk8.nullable.Person;
import no.arktekk.talkjdk8.nullable.Position;

import javax.annotation.Nullable;

public class OptionalDemo {

    @Nullable
    public static Integer getCount() {
        return 3;
    }

    public static void main(String[] args) {
        for (int i = 0; i < getCount(); ++i) {
            System.out.println("Hurra");
        }
    }



    {
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
