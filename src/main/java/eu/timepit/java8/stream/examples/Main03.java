package eu.timepit.java8.stream.examples;

import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Main03 {
    public static void main(String[] args) {
        IntPredicate isEven = i -> {
            System.out.println(i);
            return i % 2 == 0;
        };

        final IntStream evens = IntStream.range(1, 10);
        // Streams sind lazy
        final OptionalInt first = evens.filter(isEven).findFirst();
        System.out.println("evens.findFirst(): " + first);

        final int sum = evens.filter(isEven).sum();
        System.out.println("evens.sum(): " + sum);
    }
}
