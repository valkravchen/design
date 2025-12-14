package ru.lafore;

public class OrderedApp {
    public static void main(String[] args) {
        OrdArray array = new OrdArray(100);
        array.insert(77);
        array.insert(99);
        array.insert(44);
        array.display();
    }
}
