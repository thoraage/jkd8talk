package no.arktekk.talkjdk8;

public class JDK8LambdaDemo {

    @FunctionalInterface
    public static interface MyFunction {
        void doMe();
        // doesn't work: void doMoToo();
        // does work: default void doMoToo() {}
    }

    public static void doWith(MyFunction myFunction) {
        myFunction.doMe();
    }

    public static void main(String[] args) {
        doWith(() -> {
            System.out.println("yo");
        });
    }

}
