package ru.io;

import java.io.IOException;
import java.io.PrintWriter;

public class RussianText {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("example/russian.txt")) {
            writer.println("Привет, мир!");
            writer.println("Содержимое отображается корректно");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
