package ru.io;

import java.io.FileInputStream;

public class ReadFileGreeting {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("example/greeting.txt")) {
            StringBuilder text = new StringBuilder();
            int byteValue;

            while ((byteValue = input.read()) != -1) {
                text.append((char) byteValue);
            }
            System.out.println("Содержимое файла:");
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
