package ru.generics;

public class Node<T> {
    private T data;
    private Node<T> text;

    public Node(T data, Node<T> text) {
        this.data = data;
        this.text = text;
    }

    public T getData() {
        return data;
    }
}
