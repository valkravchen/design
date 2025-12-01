package ru.generics;

import java.util.*;

public class GenericUsage {
    public void addAll(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        for (Object line : list) {
            System.out.println("Текущий элемент: " + line);
        }
    }

    public void printInfo(Collection<? extends Person> collection) {
        for (Iterator<? extends Person> iterator = collection.iterator(); iterator.hasNext(); ) {
            Person next = iterator.next();
            System.out.println(next);
        }
    }

    public void printResult(Collection<?> collection) {
        for (Iterator<?> iterator = collection.iterator(); iterator.hasNext(); ) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<>();
        new GenericUsage().addAll(list);
    }
}

