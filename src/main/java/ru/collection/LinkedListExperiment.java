package ru.collection;

public class LinkedListExperiment {
    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = null;  // пустой список
        head = new Node<>(10, null);
        System.out.println(head.item);  // 10
        head.next = new Node<>(20, null);
        System.out.println(head.next.item);
    }
}

