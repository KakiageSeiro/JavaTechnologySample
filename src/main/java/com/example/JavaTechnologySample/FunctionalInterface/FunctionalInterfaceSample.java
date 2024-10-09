package com.example.JavaTechnologySample.FunctionalInterface;

import java.util.function.*;

public class FunctionalInterfaceSample {
    public static void consumerSample(Consumer<String> consumer, String string) {
        consumer.accept(string);
    }

    public static String supplierSample(Supplier<String> supplier) {
        return supplier.get();
    }

    public static Integer functionSample(Function<String, Integer> function, String string) {
        return function.apply(string);
    }

    public static boolean predicateSample(Predicate<String> predicate, String string) {
        return predicate.test(string);
    }

    public static void biConsumerSample(BiConsumer<String, String> biConsumer, String string1, String string2) {
        biConsumer.accept(string1, string2);
    }

    public static Integer functionAndThenSample(Function<String, Integer> function1, Function<Integer, Integer> function2, String string) {
        return function1.andThen(function2).apply(string);
    }

}
