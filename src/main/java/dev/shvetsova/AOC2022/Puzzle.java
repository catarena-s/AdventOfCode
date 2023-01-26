package dev.shvetsova.AOC2022;

import dev.shvetsova.AOC2022.utils.FileReader;

import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Puzzle {
    private static final Logger logger = Logger.getLogger(Puzzle.class.getName());
    public static final String PUZZLE_INPUT_PATH = "src/main/java/dev/shvetsova/AOC2022/day_%s/resources/%s";
    public static final String INPUT_FILE = "input_%s.txt";
    public static final String TEST_INPUT_FILE = "test_input_%s%s.txt";
    public static final String LINE_SEPARATOR = System.lineSeparator();
    private String inputString;
    private final String day;
    protected String msg;

    protected Puzzle() {
        day = getDataForCurrentDay();
    }

    protected void execute(boolean isTest) {
        readFromFile(isTest, "");
        msg = String.format("%s: ", isTest ? "Test#" : "Input#");
    }

    protected void execute(boolean isTest, boolean isTask1) {
        readFromFile(isTest, "");
        initMSG(isTest, isTask1);
    }

    protected void execute(boolean isTest, boolean isTask1, String suffix) {
        readFromFile(isTest, suffix);
        initMSG(isTest, isTask1);
    }

    private void initMSG(boolean isTest, boolean isTask1) {
        int numTask = isTask1 ? 1 : 2;
        msg = String.format("%s%d: ", isTest ? "Test#" : "Input#", numTask);
    }

    protected void readFromFile(boolean isTest, String suffix) {
        if (isTest) this.readTestInputFile(suffix);
        else this.readInputFile();
    }

    public String getInputString() {
        return inputString;
    }

    public String[] getLines() {
        return inputString.split(LINE_SEPARATOR);
    }

    public void readInputFile() {
        String fileName = String.format(INPUT_FILE, day);
        readLine(fileName);
    }

    public void readTestInputFile() {
        readTestInputFile("");
    }

    public void readTestInputFile(String suffix) {
        String fileName = String.format(TEST_INPUT_FILE, day, suffix);
        readLine(fileName);
    }

    private void readLine(String fileName) {
        Path file = getPath(fileName);
        try {
            inputString = FileReader.readLine(file);
        } catch (IOException e) {
            logger.log(Level.WARNING, "File reading problem: {0}", e.getMessage());
        }
    }

    private Path getPath(String fileTmp) {
        return Path.of(String.format(PUZZLE_INPUT_PATH, day.substring(3), fileTmp));
    }

    protected abstract String getDataForCurrentDay();
}
