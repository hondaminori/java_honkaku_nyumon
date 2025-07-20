package com.example.chapter4;

import java.util.stream.Stream;

public class Sample4_7_v8_2 {
    public static void main(String[] args) {
        Character[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        // charのストリームを流す感覚
        Stream.of(array)
            .forEach(c -> System.out.println(c));
    }
}
