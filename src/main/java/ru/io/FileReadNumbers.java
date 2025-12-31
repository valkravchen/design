package ru.io;

import java.io.FileInputStream;

public class FileReadNumbers {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("example/numbers.txt")) {
            StringBuilder text = new StringBuilder();
            int byteValue;

            while ((byteValue = input.read()) != -1) {
                text.append((char) byteValue);
            }
            String[] lines = text.toString().split(System.lineSeparator());
            int count = 0;
            for (String line : lines) {
                int number = Integer.parseInt(line);
                count += number;
            }
            System.out.println("Сумма = " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
