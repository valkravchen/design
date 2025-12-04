package ru.generics.example;

public class Safe<T> {
    private T value;

    public Safe(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Safe<String> safe1 = new Safe<>("секрет");
        System.out.println(safe1.getValue());
        Safe<Integer> safe2 = new Safe<>(42);
        System.out.println(safe2.getValue());
    }
}
