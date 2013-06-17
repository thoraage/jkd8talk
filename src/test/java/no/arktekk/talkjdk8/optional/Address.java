package no.arktekk.talkjdk8.optional;

public class Address {
    private final String postalCode;
    private final String city;

    public Address(String postalCode, String city) {
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}
