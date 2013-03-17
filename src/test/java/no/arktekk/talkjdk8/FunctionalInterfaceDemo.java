package no.arktekk.talkjdk8;

public class FunctionalInterfaceDemo {

    public static interface FunctionalInterface {
        void doMe();
    }

    public static void doWith(FunctionalInterface functionalInterface) {
        functionalInterface.doMe();
    }

    public static void main(String[] args) {
        doWith(() -> System.out.println("yo"));
    }

}
