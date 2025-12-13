package ru.lafore;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray array;
        array = new LowArray(100);
        int countElements = 0;
        int index;

        array.setElement(0, 77);
        array.setElement(1, 99);
        array.setElement(2, 44);
        array.setElement(3, 55);
        array.setElement(4, 22);
        array.setElement(5, 88);
        array.setElement(6, 11);
        array.setElement(7, 0);
        array.setElement(8, 66);
        array.setElement(9, 33);

        countElements = 10;

        for (index = 0; index < countElements; index++) {
            System.out.print(array.getElement(index) + " ");
        }
        System.out.println();

        int searchKey = 26;
        for (index = 0; index < countElements; ++index) {
            if (array.getElement(index) == searchKey) {
                break;
            }
        }

        if (index == countElements) {
            System.out.println("Элемент " + searchKey + " не найден");
        } else {
            System.out.println("Элемент " + searchKey + " найден");
        }

        for (index = 0; index < countElements; index++) {
            if (array.getElement(index) == 55) {
                break;
            }
        }

        for (int i = index; i < countElements; i++) {
            array.setElement(i, array.getElement(i + 1));
        }
        countElements--;

        for (index = 0; index < countElements; index++) {
            System.out.print(array.getElement(index) + " ");
        }
        System.out.println();
    }
}
