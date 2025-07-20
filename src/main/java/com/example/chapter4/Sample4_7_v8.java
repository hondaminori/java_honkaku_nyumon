package com.example.chapter4;

import java.util.stream.IntStream;

public class Sample4_7_v8 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        // どちらかというとカウンタ主体の考え方
        IntStream.range(0, array.length)
            .forEach(i -> System.out.println(array[i]));    
    }
}
