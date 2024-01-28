package com.interview.practice.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Slf4j
public class FlatMapExample {

    public static void main(String[] args) {
        List<String> loseWeight = new ArrayList<>();
        loseWeight.add("avocados");
        loseWeight.add("beans");
        loseWeight.add("salad");
        loseWeight.add("oats");
        loseWeight.add("broccoli");
        log.info("list of String : {}", loseWeight);
        // let's use map() method to convert list of weight // lose food, which are String to list of ints
        // which are length of each foodString
        var listOfInts = loseWeight.stream().map(String::length).toList();

        log.info("list of ints generate by map(): {}", listOfInts);
        // flatMap() example,
        // let's first creat a list of list
        List<List<Integer>> listOfListOfNumber = new ArrayList<>();
        listOfListOfNumber.add(Arrays.asList(2, 4));
        listOfListOfNumber.add(Arrays.asList(3, 9));
        listOfListOfNumber.add(Arrays.asList(4, 16));

        log.info("list of list : {}", listOfListOfNumber);
        // let's use flatMap() to flatten this list into // list of integers i.e. 2,4,3,9,4,16
        var listOfIntegers = listOfListOfNumber.stream().flatMap(Collection::stream).toList();
        log.info("list of numbers generated by flatMap : {}", listOfIntegers);

    }
}
