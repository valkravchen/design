package ru.io;

import java.io.FileInputStream;

public class ReadFileExample {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("example/dataresult.txt")) {
            StringBuilder text = new StringBuilder();
            int byteValue;

            while ((byteValue = input.read()) != -1) {
                text.append((char) byteValue);
            }
            System.out.println("Содержимое файла:");
            System.out.println(text);
            String content = text.toString();
            String[] lines = content.split(System.lineSeparator());

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
