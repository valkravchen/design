package ru.lafore;

public class LowArray {
    private long[] array;

    public LowArray(int size) {
        this.array = new long[size];
    }

    public void serElement(int index, long value) {
        array[index] = value;
    }

    public long getElement(int index) {
        return array[index];
    }
}
