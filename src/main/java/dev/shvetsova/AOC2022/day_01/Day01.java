package dev.shvetsova.AOC2022.day_01;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.utils.Printer;

import java.io.IOException;

/**
 * --- Day 1: Calorie Counting ---
 **/
public class Day01 extends Puzzle {

    public static void main(String[] args) {
        //test input ------------------------------------------
        Day01 puzzle = new Day01();
        puzzle.execute(true);
        //puzzle input ----------------------------------------
        puzzle.execute(false);
    }

    @Override
    protected void execute(boolean isTest) {
        super.execute(isTest);

        ElfCalories elfCalories = new ElfCalories();

        elfCalories.init(this.getLines());
        Printer.printMessage(msg+"Max: %d -> %d (%d)",
                elfCalories.elfHasMostCalories,
                elfCalories.maxCalories,
                elfCalories.getSumTopThreeElves());

    }

    @Override
    protected String getDataForCurrentDay() {
        return Day01.class.getSimpleName();
    }
}
