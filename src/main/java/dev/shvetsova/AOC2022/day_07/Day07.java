package dev.shvetsova.AOC2022.day_07;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.day_07.model.FileSystem;
import dev.shvetsova.AOC2022.utils.Printer;

import java.io.IOException;

/**
 * --- Day 7: No Space Left On Device ---
 **/
public class Day07 extends Puzzle {

    public static void main(String[] args) {
        Day07 puzzle = new Day07();
        //test input ------------------------------------------
        puzzle.execute(true, true);//task 1
        puzzle.execute(true, false);//task 2
        //puzzle input ----------------------------------------
        puzzle.execute(false, true); //task 1
        puzzle.execute(false, false); //task 2
    }

    @Override
    protected void execute(boolean isTest, boolean isTask1) {
        super.execute(isTest, isTask1);

        FileSystem fileSystem = new FileSystem();
        fileSystem.init(this.getLines());
        if (isTask1)
            Printer.printMessage(msg + fileSystem.getMinSum());
        else
            Printer.printMessage(msg + fileSystem.findMinPath());

    }

    @Override
    protected String getDataForCurrentDay() {
        return Day07.class.getSimpleName();
    }
}
