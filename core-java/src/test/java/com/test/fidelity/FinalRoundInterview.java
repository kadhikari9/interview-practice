package com.test.fidelity;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class FinalRoundInterview {

    @Test
    public void test() {
        Integer[] array = new Integer[]{0, 1, 2, 3, 4, 5, 0, 4, 7};

        List<Integer> collect = Arrays.stream(array)
                .collect(Collectors.groupingBy(val -> val, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).toList();

        System.out.println(Arrays.toString(collect.toArray()));
    }

    @Test
    public void palindrome() {
        List<String> str = Arrays.asList(new String("xx"),
                new String("xx"));
        str=new ArrayList<>(str);
        System.out.println(str.size());

        for (int i = 0; i < str.size(); i++) {
            str.remove(str.get(i));
        }
        str.remove("xx");
        System.out.println(str.size());
    }


}
