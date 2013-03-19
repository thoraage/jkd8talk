package no.arktekk.talkjdk8;

public class JDK8LambdaDemo {

    @FunctionalInterface
    public static interface MyFunction {
        void doMe();
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
