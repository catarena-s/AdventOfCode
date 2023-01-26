package dev.shvetsova.AOC2022.day_05;

public class Parser {
    public String parse(String line) {
        return line.replace("] ", ",")
                .replace("    ", " ,")
                .replace(",[", ",")
                .replace("[", "")
                .replace("]", "");
    }
}
