package dev.shvetsova.AOC2022.day_05;

import dev.shvetsova.AOC2022.utils.Parser;

public class ParserImpl implements Parser {
    @Override
    public String parse(String line) {
        return line.replace("] ", ",")
                .replace("    ", " ,")
                .replace(",[", ",")
                .replace("[", "")
                .replace("]", "");
    }
}
