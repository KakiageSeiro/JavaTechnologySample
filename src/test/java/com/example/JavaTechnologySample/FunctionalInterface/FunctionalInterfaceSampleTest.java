package com.example.JavaTechnologySample.FunctionalInterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FunctionalInterfaceSampleTest {
    @Test
    void consumerSample() {
        FunctionalInterfaceSample.consumerSample(System.out::println, "■■■Consumerの引数だよ■■■");
    }

    @Test
    void supplierSample() {
        String s = FunctionalInterfaceSample.supplierSample(() -> "supplierの戻り値だよ");
        Assertions.assertEquals("supplierの戻り値だよ", s);
    }

    @Test
    void functionSample() {
        Integer length = FunctionalInterfaceSample.functionSample(String::length, "abc");
        Assertions.assertEquals(3, length);
    }

    @Test
    void predicateSample() {
        Assertions.assertTrue(FunctionalInterfaceSample.predicateSample((string) -> string.equals("ショートケーキ"), "ショートケーキ"));
    }

    @Test
    void biConsumerSample() {
        FunctionalInterfaceSample.biConsumerSample((s1, s2) -> System.out.println(s1 + ":" + s2), "■■■A", "B■■■");
    }

    @Test
    void functionAndThenSample() {
        Integer length = FunctionalInterfaceSample.functionAndThenSample(String::length, (len) -> len + 10, "abc");
        Assertions.assertEquals(13, length);
    }


}