package org.programs.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreams {
    public static void main(String[] a) {
        IntStream numbers = IntStream.of(1, 2, 3, 4, 5);
        LongStream longStream = LongStream.of(1, 2, 3, 4, 5);
        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        int max = numbers.max().getAsInt();
        System.out.println("Max of int = " + max);
        double avg = LongStream.of(1, 2, 3, 4, 5).average().getAsDouble();
        System.out.println("Avg = " + avg);
        int sum = IntStream.range(1, 10).sum();
        System.out.println("Sum using range = " + sum);
    }
}
