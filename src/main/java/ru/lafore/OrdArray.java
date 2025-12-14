package ru.lafore;

public class OrdArray {
    private long[] array;
    private int countElements;

    public OrdArray(int max) {
        this.array = new long[max];
        this.countElements = 0;
    }

    public int size() {
        return countElements;
    }

    public int found(long searchValue) {
        int lowerIndex = 0;
        int upperIndex = countElements - 1;
        int currentIndex;

        while (lowerIndex <= upperIndex) {
            currentIndex = (lowerIndex + upperIndex) / 2;
            if (array[currentIndex] == searchValue) {
                return currentIndex;
            } else if (array[currentIndex] > searchValue) {
                upperIndex = currentIndex - 1;
            } else {
                lowerIndex = currentIndex + 1;
            }
        }
        return -1;
    }

    public void insert(long value) {
        int index;
        for (index = 0; index < countElements; index++) {
            if (array[index] > value) {
                break;
            }
        }
        for (int i = countElements; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        countElements++;
    }

    public void display() {
        for (int i = 0; i < countElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
