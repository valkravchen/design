package ru.lafore;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray array;
        array = new HighArray(maxSize);

        array.insert(77L);
        array.insert(99L);
        array.insert(44L);
        array.insert(55L);
        array.insert(22L);
        array.insert(88L);
        array.insert(11L);
        array.insert(0L);
        array.insert(66L);
        array.insert(33L);

        array.display();

        int searchKey = 35;

        if (array.find(searchKey)) {
            System.out.println("Элемент " + searchKey + " найден");
        } else {
            System.out.println("Элемент " + searchKey + " не найден");
        }

        array.delete(0L);
        array.delete(55L);
        array.delete(99L);

        array.display();
    }
}
