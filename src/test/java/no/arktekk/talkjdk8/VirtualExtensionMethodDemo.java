package no.arktekk.talkjdk8;

public class VirtualExtensionMethodDemo {

    public static interface AnInterface {
        default void print(String msg) {
            System.out.println(msg);
        }
    }

    public static interface AnotherInterface {
        default String getMessage() {
            return getClass().getName();
        }
    }

    public static class MyClass implements AnInterface, AnotherInterface {}

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.print(myClass.getMessage());
    }

}
