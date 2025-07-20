package com.example.chapter4;

import java.util.stream.IntStream;

public class Sample4_8_v8 {
    public static void main(String[] args) {
        IntStream.range(0, 10)
            .filter(i -> i % 4 == 0)
            .forEach(i -> System.out.println("4の倍数です:" + i));
    }
}
