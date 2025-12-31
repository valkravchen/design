package ru.io;

import java.io.FileInputStream;

public class ReadFileCounter {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("example/counter.txt")) {
            StringBuilder text = new StringBuilder();
            int byteValue;
            int allSymbols = 0;
            int symbolsWithoutWhitespace = 0;

            while ((byteValue = input.read()) != -1) {
                text.append((char) byteValue);
                allSymbols++;
                if (byteValue != 32) {
                    symbolsWithoutWhitespace++;
                }
            }
            System.out.println("Содержимое файла:");
            System.out.println(text);
            System.out.println(allSymbols);
            System.out.println(symbolsWithoutWhitespace);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
