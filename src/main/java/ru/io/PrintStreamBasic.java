package ru.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamBasic {
    public static void main(String[] args) {
        try (PrintStream stream = new PrintStream(new FileOutputStream("example/hello.txt"))) {
            stream.println("Имя: Добрыня");
            stream.println("Дата рождения: 09.09.2008");
            stream.println("Любимый язык программирования: Java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
