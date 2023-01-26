package dev.shvetsova.AOC2022.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
    private FileReader() {
    }

    public static String readLine(Path file) throws IOException {
        return Files.readString(Path.of(file.toString()));
    }
}
