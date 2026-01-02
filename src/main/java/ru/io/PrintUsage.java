package ru.io;

import java.io.IOException;
import java.io.PrintStream;

public class PrintUsage {
    public static void main(String[] args) {
        try (PrintStream stream = new PrintStream("data/print.txt")) {
            stream.println("Из PrintStream в FileOutputStream");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
