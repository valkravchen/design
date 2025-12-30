package ru.io;

import java.io.FileOutputStream;

public class ResultFile {

    public static int[][] multiplicationTable(int size) {
        int[][] array = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                array[i - 1][j - 1] = i * j;
            }
        }
        return array;
    }

    public static String arrayToString(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                stringBuilder.append(i + 1)
                        .append(" x ")
                        .append(j + 1)
                        .append(" = ")
                        .append(array[i][j])
                        .append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int[][] table = multiplicationTable(10);
        String result = arrayToString(table);
        try (FileOutputStream output = new FileOutputStream("data/dataresult.txt")) {
            output.write(result.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
