package ru.lafore;

public class HighArray {
    private long[] array;
    private int countElements;

    public HighArray(int max) {
        this.array = new long[max];
        this.countElements = 0;
    }

    public boolean find(long searchKey) {
        int index;
        for (index = 0; index < countElements; index++) {
            if (array[index] == searchKey) {
                break;
            }
        }
        return index != countElements;
    }

    public void insert(Long value) {
        array[countElements++] = value;
    }

    public boolean delete(long value) {
        int index;
        for (index = 0; index < countElements; index++) {
            if (value == array[index]) {
                break;
            }
        }
        if (index == countElements) {
            return false;
        } else {
            for (int i = index; i < countElements; i++) {
                array[i] = array[i + 1];
            }
            countElements--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < countElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
