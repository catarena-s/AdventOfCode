package dev.shvetsova.AOC2022.utils;

public class Printer {
    private Printer() {
    }

    private static final String MSG_SEPARATOR = "---------------------------------------------------------------------------\n";

    public static void printSeparator() {
        System.out.println(MSG_SEPARATOR);
    }

    public static void printEmptySting() {
        System.out.println();
    }

    public static void printMessage(String messageTemplate, Object... args) {
        System.out.printf(messageTemplate + "\n", args);
    }

    public static void printMessage(Integer number) {
        System.out.printf("%d%n", number);
    }

    public static void printMessage(Long number) {
        System.out.printf("%d%n", number);
    }
}
