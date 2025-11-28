package ru.assertj;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleConvert {

    public String[] toArray(String... example) {
        return example;
    }

    public List<String> toList(String... example) {
        return Arrays.stream(example).toList();
    }

    public Set<String> toSet(String... example) {
        return Arrays.stream(example).collect(Collectors.toSet());
    }

    public Map<String, Integer> toMap(String... example) {
        return Stream.iterate(0, integer -> integer < example.length, integer -> integer + 1)
                .collect(Collectors.toMap(
                        integer -> example[integer], integer -> integer, (s1, s2) -> s1));
    }
}
