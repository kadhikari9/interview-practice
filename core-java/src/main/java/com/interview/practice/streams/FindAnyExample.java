package com.interview.practice.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class FindAnyExample {

    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "JavaScript"};

        for (int i = 0; i < 100; i++) {
            // Any will return any items from the list, behavior us unpredictable
            var any = Arrays.stream(languages).parallel().findAny();
            log.info("Any return: {}", any.get());

            var first = Arrays.stream(languages).parallel().findFirst();
            log.info("First Return: {}", first.get());
        }
    }
}
