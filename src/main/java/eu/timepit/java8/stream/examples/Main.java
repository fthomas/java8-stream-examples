package eu.timepit.java8.stream.examples;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final IntStream one = IntStream.of(1);
        final int sum = one.sum();

        final IntStream range = IntStream.range(1, 101);
        final int sum1 = range.sum();

        final IntStream nats = IntStream.iterate(1, i -> i + 1);
        //final int sum2 = nats.sum();
        final int sum2 = nats.limit(100).sum();

        System.out.println("Hello World!");
    }
}
