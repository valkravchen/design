package ru.generics;

import java.util.*;

public class GenericUsage {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        for (String line : list) {
            System.out.println("Текущий элемент: " + line);
        }
    }
}
