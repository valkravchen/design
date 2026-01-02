package ru.io;

import java.io.IOException;
import java.io.PrintStream;

public class FormattedOutput {
    public static void main(String[] args) {
        try (PrintStream stream = new PrintStream("example/formatted.txt")) {
            for (int i = 1; i <= 10; i++) {
                stream.printf("7 x %d = %d%n", i, 7 * i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
