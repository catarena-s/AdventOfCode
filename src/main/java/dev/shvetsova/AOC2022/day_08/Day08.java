package dev.shvetsova.AOC2022.day_08;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.day_08.model.Forest;
import dev.shvetsova.AOC2022.utils.Printer;

import java.io.IOException;

/**
 * --- Day 5: Treetop Tree House ---
 **/
public class Day08 extends Puzzle {

    public static void main(String[] args) {
        Day08 puzzle = new Day08();
        //test input ------------------------------------------
        puzzle.execute(true, true); //task 1
        puzzle.execute(true, false); //task 2
        //puzzle input ----------------------------------------
        puzzle.execute(false, true); //task 1
        puzzle.execute(false, false); //task 2
    }

    @Override
    protected void execute(boolean isTest, boolean isTask1) {
        super.execute(isTest, isTask1);
        final Forest forest = new Forest(this.getLines());

        if (isTask1) {
            Printer.printMessage(msg + forest.getCountVisibleTree());
        } else {
            Printer.printMessage(msg + forest.getMaxScore());
        }
    }

    @Override
    protected String getDataForCurrentDay() {
        return Day08.class.getSimpleName();
    }
}
