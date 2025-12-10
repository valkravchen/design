package ru.algorithm;

public class Algorithm {

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

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int value = 7;
        System.out.println(binarySearch(array, value));
    }
}
