package ru.io;

import java.io.FileInputStream;
import java.io.IOException;

public class EvenNumberFile {
    public static String[] readLines(String path) {
        StringBuilder text = new StringBuilder();
        try (FileInputStream input = new FileInputStream(path)) {
            int byteValue;

            while ((byteValue = input.read()) != -1) {
                text.append((char) byteValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString().split(System.lineSeparator());
    }

    public static void printEvenNumbers(String[] lines) {
        for (String line : lines) {
            int number = Integer.parseInt(line);
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        String[] lines = readLines("data/even.txt");
        printEvenNumbers(lines);
    }
}
