package eu.timepit.java8.stream.examples;

import java.util.stream.IntStream;

public class Main02 {
    static IntStream oneToTen() {
        return IntStream.range(1, 10);
    }

    public static void main(String[] args) {
        final IntStream ints = IntStream.range(1, 10);

        System.out.println("ints.findFirst(): " + ints.findFirst());
        System.out.println("ints.findFirst(): " + ints.findFirst());

        System.out.println("oneToTen().findFirst(): " + oneToTen().findFirst());
        System.out.println("oneToTen().findFirst(): " + oneToTen().findFirst());
    }
}
