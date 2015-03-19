package eu.timepit.java8.stream.examples;

import java.util.stream.IntStream;

public class Main01 {
    public static void main(String[] args) {
        final IntStream one = IntStream.of(1);
        final int sum = one.sum();
        System.out.println("one.sum(): " + sum);

        final IntStream range = IntStream.range(1, 101);
        final int sum1 = range.sum();
        System.out.println("range.sum(): " + sum1);

        final IntStream nats = IntStream.iterate(1, i -> i + 1);
        //final int sum2 = nats.sum(); // terminiert nicht; heizt die CPU
        final int sum2 = nats.limit(100).sum();
        System.out.println("nats.limit(100).sum(): " + sum2);
    }
}
