package no.arktekk.talkjdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * From http://cafe.elharo.com/programming/java-programming/why-functional-programming-in-java-is-dangerous/
 */
public class FunctionalDangerousJava {

    public static void main(String[] args) {
        for (Object o : take(25, squaresOf(integers()))) {
            System.out.println(o);
        }
    }

    public static List<?> take(int n, List<?> list) {
        return list.subList(0, n);
    }

    public static List<Integer> squaresOf(List<Integer> list) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer number : list) {
            result.add(number.intValue() * number.intValue());
        }
        return result;
    }

    public static List<Integer> integers() {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            result.add(i);
        }
        return result;
    }

}