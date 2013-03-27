package no.arktekk.talkjdk8;

public class VirtualExtensionMethodDemo {

    public static interface Printer extends IMessenger {
        default void print() {
            System.out.println(getMessage());
        }
    }

    public static interface IMessenger {
        String getMessage();
    }

    public static interface Messenger extends IMessenger {
        default String getMessage() {
            return getClass().getName();
        }
    }

    public static class MyClass implements Messenger, Printer {}

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.print();
    }

}
