package ru.lafore;

public class ArrayApp {
    public static void main(String[] args) {
        long[] array;
        array = new long[100];
        int countElements = 0;
        int counter;
        long searchKey;

        array[0] = 77;
        array[1] = 99;
        array[2] = 44;
        array[3] = 55;
        array[4] = 22;
        array[5] = 88;
        array[6] = 11;
        array[7] = 00;
        array[8] = 66;
        array[9] = 33;
        countElements = 10;

        for (counter = 0; counter < countElements; counter++) {
            System.out.print(array[counter] + " ");
        }
        System.out.println();
        searchKey = 66;
        for (counter = 0; counter < countElements; counter++) {
            if (array[counter] == searchKey) {
                break;
            }
        }
        if (counter == countElements) {
            System.out.println("Элемент " + searchKey + " не найден");
        } else {
            System.out.println("Элемент " + searchKey + " найден");
        }
        searchKey = 55;
        for (counter = 0; counter < countElements; counter++) {
            if (array[counter] == searchKey) {
                break;
            }
        }
        for (int i = counter; i < countElements - 1; i++) {
            array[i] = array[i + 1];
        }
        countElements--;
        for (counter = 0; counter < countElements; counter++) {
            System.out.print(array[counter] + " ");
        }
        System.out.println();
    }
}
