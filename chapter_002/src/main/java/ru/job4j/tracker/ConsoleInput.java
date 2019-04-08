package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Метод для пользовательского ввода, реализующий метод ask интефейса Input.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();

    }
}
