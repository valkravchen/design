package ru.algorithm;

import java.util.Arrays;

public class Algorithm<T> {

    public static int binarySearch(int[] array, int value) {
        int startIndex = 0;
        int finishIndex = array.length - 1;

        while (startIndex <= finishIndex) {
            int middle = (startIndex + finishIndex) / 2;
            int guess = array[middle];
            if (guess == value) {
                return middle;
            } else if (guess > value) {
                finishIndex = middle - 1;
            } else {
                startIndex = middle + 1;
            }
        }
        return -1;
    }

    public static int findSmallest(int[] array) {
        int lowestValue = array[0];
        int lowestIndex = 0;
        for (int index = 1; index < array.length; index++) {
            if (array[index] < lowestValue) {
                lowestValue = array[index];
                lowestIndex = index;
            }
        }
        return lowestIndex;
    }

    public static int[] selectionSort(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            int lowestIndex = findSmallest(array);
            newArray[i] = lowestIndex;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 2, 10};
        int value = 7;
        System.out.println(binarySearch(array, value));
        System.out.println(findSmallest(array));
        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
