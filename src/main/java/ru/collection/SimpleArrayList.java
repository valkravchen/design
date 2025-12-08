package ru.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class SimpleArrayList<T> implements SimpleList<T> {
    private T[] container;
    private int size;
    private int modCount;

    public SimpleArrayList(int capacity) {
        this.container = (T[]) new Object[capacity];
    }

    @Override
    public void add(T value) {
//        Objects.checkIndex(size, container.length);
        if (size == container.length && container.length != 0) {
            arrayExpansion();
        }
        container[size++] = value;
        modCount++;
    }

    @Override
    public T set(int index, T newValue) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    private void arrayExpansion() {
        if (container.length == 0) {

        } else  {
            container = Arrays.copyOf(container, container.length * 2);
    }
}

//    public void checkIndexExample(int[] array, int index) {
//        Objects.checkIndex(index, array.length);
//        System.out.println("Индекс " + index + " находится в пределах допустимого");
//        System.out.println("Значение по индексу " + index + ": " + array[index]);
//    }
//
//    public static void main(String[] args) {
//        int size = 0;
//        String[] strings = new String[5];
//        strings[size++] = "One";
//        strings[size++] = "Two";
//        strings[size++] = "Three";
//        System.out.println("Длина массива: " + strings.length);
//        System.out.println(Arrays.toString(strings));
//        System.out.println("Количество реально добавленных элементов: " + size);
//        String[] newStrings = Arrays.copyOf(strings, strings.length * 2);
//        System.out.println("Длина нового массива: " + newStrings.length);
//        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.toString(newStrings));
//        strings = newStrings;
//        System.out.println(Arrays.toString(strings));
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.arraycopy(
//                numbers,
//                3,
//                numbers,
//                2,
//                2
//        );
//
//        numbers[numbers.length - 1] = 0;
//        System.out.println(Arrays.toString(numbers));
//
//        String[] array = {"one", "two", "three", "four", "five"};
//        System.out.println(Arrays.toString(array));
//        // индекс по которому удаляем
//        int index = 2;
//        System.arraycopy(
//                array, // откуда копируем
//                index + 1, // начиная с какого индекса
//                array, // куда копируем
//                index, // начиная с какого индекса
//                array.length - index - 1 // сколько элементов копируем
//        );
//        // на последнее место ставим null, чтобы не было утечки памяти (если удаляем последний элемент)
//        array[array.length - 1] = null;
//        System.out.println(Arrays.toString(array));
//        SimpleArrayList list = new SimpleArrayList(3);
//        list.checkIndexExample(numbers, 3);
//        list.checkIndexExample(numbers, 5);
//    }

