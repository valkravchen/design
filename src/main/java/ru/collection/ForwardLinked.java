package ru.collection;

import java.util.Iterator;

public class ForwardLinked<T> implements Iterable<T> {
    private int size;
    private int modCount;
    private Node<T> head;

    public void add(T value) {
        if (head == null) {
            head = new Node<>(value, null);
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(value, null);
        }
        size++;
        modCount++;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private static class Node<T> {
        private T item;
        private Node<T> next;

        public Node(T element, Node<T> next) {
            this.item = element;
            this.next = next;
        }
    }
}
