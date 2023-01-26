package dev.shvetsova.AOC2022.day_05;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.day_05.model.Blocks;
import dev.shvetsova.AOC2022.utils.Printer;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.Collectors;

/** --- Day 5: Supply Stacks --- **/
public class Day05 extends Puzzle {

    public static void main(String[] args) {
        Day05 puzzle = new Day05();
        //test input ------------------------------------------
        puzzle.execute(true, false, 3);//task 2
        //puzzle input ----------------------------------------
        puzzle.execute(false, false, 9); //task 2
    }

    private void execute(boolean isTest, boolean isTask1, int size) {
        super.execute(isTest, isTask1);
        final String[] lines = this.getLines();

        final Blocks blocks = new Blocks(size);
        final int index = blocks.init(lines, size);
        blocks.moveBlocks(lines, index + 2);
        Printer.printMessage(msg +
                Arrays.stream(blocks.getRows())
                        .map(ArrayDeque::getLast)
                        .collect(Collectors.joining()));
    }

    @Override
    protected String getDataForCurrentDay() {
        return Day05.class.getSimpleName();
    }
}
