package dev.shvetsova.AOC2022.day_05.model;

import dev.shvetsova.AOC2022.day_05.Parser;
import lombok.Getter;

import java.util.ArrayDeque;
@Getter
public class Blocks {
    private final Row[] rows;

    public Blocks(int size) {
        this.rows = new Row[size];
        for (int i = 0; i < size; i++) {
            rows[i] = new Row();
        }
    }

    public int init(String[] lines, int size) {
        final String numbs9 = "1   2   3   4   5   6   7   8   9";
        final String numbs3 = "1   2   3";
        String head;
        if (size == 9) head = numbs9;
        else head = numbs3;
        final Parser parser = new Parser();


        int index = 0;
        while (!lines[index].trim().equals(head)) {
            String[] split = (parser.parse(lines[index])).split(",");
            for (int i = 0; i < split.length; i++) {
                if (split[i].isBlank()) continue;
                rows[i].addFirst(split[i].trim());
            }
            index++;
        }
        return index;
    }

    public void moveBlocks(String[] lines, int index) {
        while (index < lines.length) {
            Command record = new Command(lines[index]);
            Row tmp = new Row();
            for (int i = 0; i < record.getMove(); i++) {
                tmp.addFirst(rows[record.getFrom() - 1].getLast());
                rows[record.getFrom() - 1].removeLast();
            }
            rows[record.getTo() - 1].addAll(tmp);
            index++;
        }
    }
    public static class  Row extends ArrayDeque<String> {
    }

}
