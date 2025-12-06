package ru.list;

import java.util.*;

public class ListUsage {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        result.add("one");
        result.add("two");
        result.add("three");
        result.replaceAll(String::toUpperCase);
        for (String string : result) {
            System.out.println("Текущий элемент: " + string);
        }
    }
}

