package no.arktekk.talkjdk8;

public class VirtualExtensionMethodDemo {

    public static interface Printer {
        default void print(String msg) {
            System.out.println(msg);
        }
    }

    public static interface Messenger {
        default String getMessage() {
            return getClass().getName();
        }
    }

    public static class MyClass implements Printer, Messenger {}

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.print(myClass.getMessage());
    }

}
