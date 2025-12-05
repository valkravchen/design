package ru.list;

import java.util.*;

public class ListUsage {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        result.add("one");
        result.add("two");
        result.add("three");
        List<String> list = new ArrayList<>();
        list.add("four");
        list.add("five");
        result.addAll(list);
        for (String string : result) {
            System.out.println("Текущий элемент: " + string);
        }
    }
}
