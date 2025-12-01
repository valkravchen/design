package ru.generics;

import java.util.*;

public class GenericUsage {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String s = (String) list.get(1);
        for (int i = 0; i < list.size(); i++) {
            String line = (String) list.get(i);
            System.out.println("Текущий элемент: " + line);
        }
    }
}
